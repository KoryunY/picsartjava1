package Proj.Robot;

public abstract class Robot {
    private String rName;
    private int year;
    private int height;
    private int weight;
    private char controlType;

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
