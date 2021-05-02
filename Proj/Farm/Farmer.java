package Proj.Farm;

import Proj.Robot.Robot;

public abstract  class Farmer extends Robot {
    private double maxWorkHours;
    private double maxWorkDistance;//int km

    public double getMaxWorkHours() {
        return maxWorkHours;
    }

    public void setMaxWorkHours(double maxWorkHours) {
        if(maxWorkHours>0)
        this.maxWorkHours = maxWorkHours;

    }

    public double getMaxWorkDistance() {
        return maxWorkDistance;
    }

    public void setMaxWorkDistance(double maxWorkDistance) {
        if (maxWorkDistance>0)
        this.maxWorkDistance = maxWorkDistance;
    }

}
