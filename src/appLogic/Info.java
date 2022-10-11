package appLogic;

import sprite.Ant;
import sprite.Coordinates;
import sprite.Sprite;

import java.util.List;
import java.util.Map;

public class Info {
    public static int MAP_SIZE = 10;

    private int numOfObj = 4;
    private int[][] pheromoneMap;
    private int[][] map;
    private int[][] costs;
    private double[][] pheromone;
    private double evaporationRate;
    private antCollection antCollection;

    public Info(){
        this.pheromoneMap = new int[MAP_SIZE][MAP_SIZE];
        this.map = new int[MAP_SIZE][MAP_SIZE];
        this.costs = new int[][]{
                                    {0, 5, 15, 4},
                                    {5, 0, 4, 8},
                                    {15, 4, 0, 1},
                                    {4, 8, 1, 0}};
        this.pheromone = new double[MAP_SIZE][MAP_SIZE];
        this.evaporationRate = 0.5;
        this.antCollection = new antCollection();
    }
    public void setPheromoneInCurrLocation(int i, int j, int val){
        this.pheromone[i][j] = val;
    }
    public void setPheromone(int i, int j, int val){
        this.pheromoneMap[i][j] = val;
    }
    public int caclCost(Coordinates[] locationArr){
        int sum = 0;
        for (Coordinates node :locationArr) {
            sum += costs[node.getX()][node.getY()];
        }
        return sum;
    }
    public double calcAntPheromone(Coordinates[] locationArr){
        double c = caclCost(locationArr);
        if (c != 0){
            return 1/c;
        }
        return 0;
    }

    /**
     * table representation by index of the array
     * the ant never stays in the same location
     * |0|1|2|
     * |3|X|4|
     * |5|6|7|
     * @param x
     * @param y
     * @return
     */
    public int[] getCloseEnv(int x, int y){
        int[] arr = new int[8];
        arr[0] = pheromoneMap[x-1][y-1];
        arr[1] = pheromoneMap[x-1][y];
        arr[2] = pheromoneMap[x-1][y+1];
        arr[3] = pheromoneMap[x][y-1];
        arr[4] = pheromoneMap[x][y+1];
        arr[5] = pheromoneMap[x+1][y-1];
        arr[6] = pheromoneMap[x+1][y];
        arr[7] = pheromoneMap[x+1][y+1];
        return arr;
    }
//    public <T> List<T> getCloseEnv(int x, int y, T[][] map){
//        List<T> paddingValues = new ArrayList<>(8);
//        paddingValues.add(map[x-1][y-1]);
//        paddingValues.add(map[x][y-1]);
//        paddingValues.add(map[x+1][y-1]);
//        paddingValues.add(map[x-1][y]);
//        paddingValues.add(map[x+1][y]);
//        paddingValues.add(map[x-1][y+1]);
//        paddingValues.add(map[x][y+1]);
//        paddingValues.add(map[x+1][y+1]);
//        return paddingValues;
//    }

    public void addAnt(Ant ant) {
        this.antCollection.addAnt(ant);
    }
    public void removeAnt(Ant ant) {
        this.antCollection.removeAnt(ant);
    }

    public appLogic.antCollection getAntCollection() {
        return antCollection;
    }

    public void setAntCollection(appLogic.antCollection antCollection) {
        this.antCollection = antCollection;
    }

    public void setMap(List<Ant> sprites){
        for (Sprite s: sprites) {
            map[s.getY()][s.getX()] = 1;
        }
    }
    public void printMap(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //todo: wrong!!!!
        this.map = new int[MAP_SIZE][MAP_SIZE];
        setMap(this.antCollection.getAnts());
        System.out.println("map:");
        for (int i = 0; i < MAP_SIZE; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < MAP_SIZE; j++) { //this equals to the column in each row.
                System.out.print(map[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }
    }
    public void printPheromoneMap(){
        System.out.print("\033[H\033[2J");
        System.out.println("pheromone map:");
        for (int i = 0; i < MAP_SIZE; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < MAP_SIZE; j++) { //this equals to the column in each row.
                System.out.print(pheromoneMap[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }
    }

    public int[][] getPheromoneMap() {
        return pheromoneMap;
    }
}
