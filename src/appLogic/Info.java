package appLogic;

import sprite.Node;

public class Info {
    private int numOfObj = 4;
    private int[][] map;
    private int[][] costs;
    private double[][] pheromone;
    private double evaporationRate;

    public Info(){
        this.map = new int[10][10];
        this.costs = new int[][]{
                                    {0, 5, 15, 4},
                                    {5, 0, 4, 8},
                                    {15, 4, 0, 1},
                                    {4, 8, 1, 0}};
        this.pheromone = new double[][]{
                                    {0, 4, 10, 3},
                                    {4, 0, 1, 2},
                                    {10, 1, 0, 1},
                                    {3, 2, 1, 0}};
        this.evaporationRate = 0.5;
    }
    public void setPheromone(int i, int j, int val){
        this.pheromone[i][j] = val;
    }
    public int caclCost(Node[] locationArr){
        int sum = 0;
        for (Node node :locationArr) {
            sum += costs[node.getX()][node.getY()];
        }
        return sum;
    }
    public double calcAntPheromone(Node[] locationArr){
        double c = caclCost(locationArr);
        if (c != 0){
            return 1/c;
        }
        return 0;
    }
}
