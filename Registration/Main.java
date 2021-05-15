package Registration;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        /* for custom location
        System.out.println("Before We Start Enter database.txt location");
        String path=s.next()+"\\database.txt";
        */
        String path="src\\Registration\\database.txt";
        List<User> users=new ArrayList<>();
        try {
            users=User.readFromFIle(path);
        } catch (IOException e) {
            File f=new File(path);
            try {
                f.createNewFile();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

        boolean isActive=true;
    while (isActive){
        System.out.println("1.Register");
        System.out.println("2.Log-In");
        System.out.println("3.Exit");
        int cmd=s.nextInt();
        switch (cmd){
            case 1:
                User u=new User();
                if(!User.Register(s,u,users)){
                    System.out.println("Try Insert Correct Data");
                    break;
                }
                users.add(u);
                try {
                    User.writeToFile(path,u.RegToTxt());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.println("Input Login");
                String login=s.next();
                System.out.println("Input Password");
                String password=s.next();

                if(User.LoginCheck(login,password,users))System.out.println("Login Success");
                else System.out.println("Invalid Data");
                break;
            case 3:
                isActive=false;
                break;
            default:
                System.out.println("Invalid command");
        }
    }
    }
}
