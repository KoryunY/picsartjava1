package Proj.Robot;

public abstract class Robot implements RobotInterFace {
    private String modelName;
    private int year;
    private int weight;
    private char controlType; // a for AI system,m for manual distance control mode
    private double Speed; // movement speed
    private char movementType;//a for Air,g for Ground,n for attached
    private int LegsOrWheelsCount; //null if Air

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>=1975 && year<=2021)
        this.year = year;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight>0)
        this.weight = weight;
    }

    public char getControlType() {
        return controlType;
    }

    public void setControlType(char controlType) {
        this.controlType = controlType;
    }

    public double getSpeed() {
        return Speed;
    }

    public void setSpeed(double speed) {
        Speed = speed;
    }

    public char getMovementType() {
        return movementType;
    }

    public void setMovementType(char movementType) {
        this.movementType = movementType;
    }

    public int getLegsOrWheelsCount() {
        return LegsOrWheelsCount;
    }

    public void setLegsOrWheelsCount(int legsOrWheelsCount) {
        LegsOrWheelsCount = legsOrWheelsCount;
    }

}
