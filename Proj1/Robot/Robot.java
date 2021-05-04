package Proj.Robot;

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

    public Robot() {

    }

    public RobotInterFace getMyInterface() {
        return myInterface;
    }

    public void setMyInterface(RobotInterFace myInterface) {
        this.myInterface = myInterface;
    }

    private RobotInterFace myInterface;

    public Robot(RobotInterFace cRobot){
        super();
        myInterface=this;
    }


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

    public static void writeToFile(String path,String text) throws IOException {
        Files.write(Paths.get(path),text.getBytes(), StandardOpenOption.APPEND);
    }
    public static String[] readFromFIle(String file) throws IOException {
        return Files.readAllLines(Paths.get(file)).toArray(new String[0]);
    }
    public void CRRbot(Scanner scanner,RobotInterFace r){
        //scanner=new Scanner(System.in);
        System.out.println("Enter model Name");
        this.setModelName(scanner.next());
        System.out.println("Enter year");
        this.setYear(scanner.nextInt());
        System.out.println("Enter Weight");
        this.setWeight(scanner.nextInt());
        System.out.println("Enter control  typ,a automat ai .. for Ai,m for manual");
        this.setControlType(scanner.next().charAt(0));
        System.out.println("Enter Movement Speed");
        this.setSpeed(scanner.nextDouble());
        System.out.println("enter Movement type agn");
        this.setMovementType(scanner.next().charAt(0));
        System.out.println("enter legs or wheels count");
        this.setLegsOrWheelsCount(scanner.nextInt());
    }

}
