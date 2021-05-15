package Registration;

import Proj.Farm.Seed.Seeding;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class User {
    private String fullName;


    private String username;
    private String email;

    public String getPassword() {
        return password;
    }

    private String password;
    public String getUsername() {
        return username;
    }

    public static boolean Register(Scanner s,User u,List<User> users){
        System.out.println("Type Full name(Name Surname)");
        s.nextLine();
        u.fullName=s.nextLine();
        System.out.println("Username (10+ non-repeating chars)");
        u.username=s.next();
        System.out.println("Email address");
        u.email=s.next();
        System.out.println("Password(min Length 8,must contain 2 uppercase letters and 3 numbers)");
        u.password=s.next();
        return u.Validate(users);
    }
    public boolean Validate(List<User> users){
        System.out.println("Pls Wait Now Validating");
        try {
            if(!fullName.matches("^([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$"))throw new Exception("Invalid Name Format");
            else if(!email.matches("^[A-Za-z0-9+_.-]+@(.+)$"))throw new Exception("Incorrect Email Address");
            else if(password.length()<=8 || password.chars().filter((s)->Character.isUpperCase(s)).count()<2 || password.chars().filter((s)->Character.isDigit(s)).count()<3 )throw new Exception("Incorrect password");
            else if(username.length()<=10 || users.stream().filter(ss-> Objects.equals(ss.getUsername(), username)).count()!=0)throw new Exception("Invalid Username or Duplicate");
            System.out.println("Successfully Registered");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public String RegToTxt() {
        String RegToTxt;
        RegToTxt = this.fullName + "," + this.username +","+this.email+"," +MD5.getMd5(this.password)+"\n";
        return RegToTxt;
    }
    public static void writeToFile(String path, String text) throws IOException {
        Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
    }

    public static List<User> readFromFIle(String file) throws IOException {
        List<String> sl= Files.readAllLines(Paths.get(file));
        List<User> users=new ArrayList<>();
        String[] split;
        for (int i=0;i<sl.size();i++) {
            User p=new User();
            split=sl.get(i).split(",");
            p.username=split[1];
            p.password=split[3];
            p.email=split[2];
            p.fullName=split[0];
            users.add(i,p);
        }
        return users;
    }
    public static boolean LoginCheck(String login,String password,List<User> users){
        return  !users.stream()
                .filter(ss-> Objects.equals(ss.getUsername(), login))
                .findAny()
                .filter(ss->Objects.equals(ss.getPassword(),MD5.getMd5(password))).isEmpty();
    }

}
