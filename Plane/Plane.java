package Plane;

public class Plane {
    private String model="defaultModel";
    private String country="defaultCountry";
    private int year;
    private int hours;
    private boolean military;
    private int weight;
    private int topSpeed;
    private int seats;
    private double cost;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return topSpeed;
    }

    public void setSpeed(int speed) {
        this.topSpeed = speed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public void printPlaneData(){
        System.out.println("_________________________________");
        System.out.println("Model:"+model);
        System.out.println("country:"+ country);

        System.out.println("Year:"+year);
        System.out.println("Hours:"+hours);
        if(military)
            System.out.println("is Military?:"+"yes");
        else System.out.println("New or Used?:"+"Used");
        System.out.println("Weight:"+weight);
        System.out.println("Top Speed:"+topSpeed);
        System.out.println("Seats Number:"+seats);
        System.out.println("Cost:"+cost);
        System.out.println("......................................");
    }
}
