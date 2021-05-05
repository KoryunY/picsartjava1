package Proj.Robot;

import Proj.Farm.Farmer;
import Proj.Farm.Seed.Seeding;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

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
        if(year>=1975)
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

    public static void writeToFile(String path,String text) throws IOException {
        Files.write(Paths.get(path),text.getBytes(), StandardOpenOption.APPEND);
    }
    public static String[] readFromFIle(String file) throws IOException {
        return Files.readAllLines(Paths.get(file)).toArray(new String[0]);
    }
    public void CreateRobot(Scanner scanner,Robot r){
        System.out.println("Enter model Name");
        r.setModelName(scanner.next());
        System.out.println("Enter year");
        r.setYear(scanner.nextInt());
        System.out.println("Enter Weight");
        r.setWeight(scanner.nextInt());
        System.out.println("Enter control  typ,a automat ai .. for Ai,m for manual");
        r.setControlType(scanner.next().charAt(0));
        System.out.println("Enter Movement Speed");
        r.setSpeed(scanner.nextDouble());
        System.out.println("enter Movement type agn");
        r.setMovementType(scanner.next().charAt(0));
        System.out.println("enter legs or wheels count");
        r.setLegsOrWheelsCount(scanner.nextInt());
    }
    public String RobotToTxt(Robot robot) {
        String seedTxt;
        seedTxt = robot.getModelName() + "," + robot.getYear() + "," + robot.getWeight() + "," + robot.getControlType() + ","
                +robot.getSpeed()+ "," +  robot.getMovementType()
                + "," + robot.getLegsOrWheelsCount()+"," ;
        return seedTxt;
    }
    public int RobotFromTxt(Robot robot,String[] split,int i){
        robot.setModelName(split[i++]);
        robot.setYear(Integer.parseInt(split[i++]));
        robot.setWeight(Integer.parseInt(split[i++]));
        robot.setControlType(split[i++].charAt(0));
        robot.setSpeed(Double.parseDouble(split[i++]));
        robot.setMovementType(split[i++].charAt(0));
        robot.setLegsOrWheelsCount(Integer.parseInt(split[i++]));
        return i;
    }
    public void PrintRobotData(Robot robot){
        System.out.println("model Name "+robot.modelName);
        System.out.println("year "+robot.year);
        System.out.println("Weight "+robot.weight);
        System.out.println("control  type "+robot.controlType);
        System.out.println("Movement Speed "+robot.Speed);
        System.out.println("Movement type agn "+robot.controlType);
        System.out.println("legs or wheels count "+robot.getLegsOrWheelsCount());
    }
}
