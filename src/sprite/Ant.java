package sprite;

import appLogic.Info;
import appLogic.Velocity;
import appLogic.antCollection;
import appLogic.AppFlow;

import java.util.*;

public class Ant implements Sprite {
    private int x, y;
    private int directionOfNextStep;
    private boolean hasFood;
    private int speed = 1;
    private Info info;
    private Velocity velocity = new Velocity(0, 0);
    private Stack<Integer> lastSteps;
    private antCollection antCollection;


    public Ant() {
        this.x = 4;
        this.y = 4;
        this.directionOfNextStep = 4;
        this.hasFood = false;
        this.info = new Info();
        lastSteps = new Stack<>();
        lastSteps.push(7 - directionOfNextStep);
    }

    public void updateTrajectory() {

    }

    @Override
    public void timePassed() {
        setDirectionByPher();
        moveOnStep();
    }

    public void setDirectionByPher() {
        if(hasFood){
            oneStepHome();
        }
        /*
         * russian rullet on the probabilities - generate a rand num(0 to the sum of all pheromones)
         * sum all the pheromones until you get to the index.
         * return the direction which its index was in the correct range.
         */
        else{
            if(x != 0 && x != Info.MAP_SIZE - 1 && y != 0 && y != Info.MAP_SIZE -1){
                Random rand = new Random();
                int totalSum = 0;
//            List<Integer> arr = info.getCloseEnv(x, y, info.getPheromoneMap());
                int[] arr = info.getCloseEnv(x, y);
                for (int i = 0; i < 8; i++) {
                    totalSum += arr[i];
                }
                // if there are no pheromones give every direction same weight
                if (totalSum == 0) {
                    totalSum = 8;
//                directionOfNextStep = 7;
                    directionOfNextStep = rand.nextInt(totalSum);
                } else {
                    int j = 0;
                    int sum = 0;
                    int index = rand.nextInt(totalSum);
                    while (sum < index) {
                        sum += arr[j++];
                    }
//                directionOfNextStep = 7;
                    directionOfNextStep = index;
                }
                // the last step is in the opposite direction.
                lastSteps.push(7 - directionOfNextStep);
            }
            else {
                // indication for out of range value
                directionOfNextStep = 8;
            }
        }
    }

    private void oneStepHome() {
        if(!lastSteps.isEmpty()){
            directionOfNextStep =  lastSteps.pop();
        }
        else {
            hasFood = false;
        }
    }


    public void moveOnStep() {
        switch (directionOfNextStep) {
            case 0:
                x -= 1;
                y -= 1;
                break;
            case 1:
                y -= 1;
                break;
            case 2:
                x += 1;
                y -= 1;
                break;
            case 3:
                x -= 1;
                break;
            case 4:
                x += 1;
                break;
            case 5:
                x -= 1;
                y += 1;
                break;
            case 6:
                y += 1;
                break;
            case 7:
                x += 1;
                y += 1;
                break;
            default:
                break;
        }

    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void addToGame(AppFlow appFlow) {
        appFlow.addToApp(this);
    }

    @Override
    public void removeFromGame(AppFlow appFlow) {
        appFlow.removeFromApp(this);
    }

    public int getDirectionOfNextStep() {
        return directionOfNextStep;
    }

    public void setDirectionOfNextStep(int directionOfNextStep) {
        this.directionOfNextStep = directionOfNextStep;
    }

    public boolean doesHaveFood() {
        return hasFood;
    }

    public void setHasFood(boolean hasFood) {
        this.hasFood = hasFood;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
