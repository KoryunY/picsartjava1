package Proj.Robot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public abstract class Robot {
    private String modelName;
    private int year;
    private int weight;
    private char controlType; // a for AI system,m for manual distance control mode
    private double Speed; // movement speed
    private char movementType;//a for Air,g for Ground,n for attached
    private int LegsOrWheelsCount = 0; //only for Ground type


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
        if (year >= 1975 && year <= 2021)
            this.year = year;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0)
            this.weight = weight;
    }

    public char getControlType() {
        return controlType;
    }

    public void setControlType(char controlType) {
        if (controlType == 'a' || controlType == 'm' || controlType == 'A' || controlType == 'M')
            this.controlType = controlType;
    }

    public double getSpeed() {
        return Speed;
    }

    public void setSpeed(double speed) {
        if (speed > 0)
            Speed = speed;
    }

    public char getMovementType() {
        return movementType;
    }

    public void setMovementType(char movementType) {
        if (movementType == 'a' || movementType == 'A' || movementType == 'g' || movementType == 'G' || movementType == 'N' || movementType == 'n')
            this.movementType = movementType;
    }

    public int getLegsOrWheelsCount() {
        return LegsOrWheelsCount;
    }

    public void setLegsOrWheelsCount(int legsOrWheelsCount) {
        if ((movementType=='g'||movementType=='G')&&legsOrWheelsCount>0&&legsOrWheelsCount<12)
            LegsOrWheelsCount = legsOrWheelsCount;
    }

    public static void writeToFile(String path, String text) throws IOException {
        Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
    }

    public static String[] readFromFIle(String file) throws IOException {
        return Files.readAllLines(Paths.get(file)).toArray(new String[0]);
    }

    public void CreateRobot(Scanner scanner, Robot r) {
        System.out.println("Enter model Name");
        r.setModelName(scanner.next());
        System.out.println("Enter year 1975-2021");
        r.setYear(scanner.nextInt());
        System.out.println("Enter Weight");
        r.setWeight(scanner.nextInt());
        System.out.println("Enter control type ,A(a,Automate ai .. )for Ai,m(M,manual,Manual) for manual");
        r.setControlType(scanner.next().charAt(0));
        System.out.println("Enter Movement Speed");
        r.setSpeed(scanner.nextDouble());
        System.out.println("enter Movement type a(A..) for Air,g(G..) for Ground,n(N,None..) for attached");
        r.setMovementType(scanner.next().charAt(0));
        System.out.println("enter legs or wheels count(0 if Not Grounded Robot,else from 1 up to 12");
        r.setLegsOrWheelsCount(scanner.nextInt());
    }

    public String RobotToTxt(Robot robot) {
        String robotTxt;
        robotTxt = robot.getModelName() + "," + robot.getYear() + "," + robot.getWeight() + "," + robot.getControlType() + ","
                + robot.getSpeed() + "," + robot.getMovementType()
                + "," + robot.getLegsOrWheelsCount() + ",";
        return robotTxt;
    }

    public int RobotFromTxt(Robot robot, String[] split, int i) {
        robot.setModelName(split[i++]);
        robot.setYear(Integer.parseInt(split[i++]));
        robot.setWeight(Integer.parseInt(split[i++]));
        robot.setControlType(split[i++].charAt(0));
        robot.setSpeed(Double.parseDouble(split[i++]));
        robot.setMovementType(split[i++].charAt(0));
        robot.setLegsOrWheelsCount(Integer.parseInt(split[i++]));
        return i;
    }

    public void PrintRobotData() {
        System.out.println("-------------------------------------------------------");
        System.out.println("model Name:" + modelName);
        System.out.println("Creation Year:" + year);
        System.out.println("Weight:" + weight+"Kgs");
        System.out.println("Control type:" + (controlType=='a'||controlType=='A'?"AI System":"Manual Mode"));
        System.out.println("Movement Speed:" + Speed+"mph");
        String ct="Empty";
        if (controlType=='a'||controlType=='A')ct="Air";
        else if (controlType=='g'||controlType=='G')ct="Ground";
        else if(controlType=='n'||controlType=='N')ct="Attached";
        System.out.println("Movement type Air-Ground-Attached:" + ct);
        System.out.println("Legs(Wheels) count:" + getLegsOrWheelsCount());

    }

}
