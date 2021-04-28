package Students;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {


        Student[] b=read("src\\Students\\students.txt");
        StudentService service=new StudentService();
        System.out.println(b[2].getName());
        boolean menuActive=true;
        while(menuActive){
            System.out.println("Enter Command from here");
            System.out.println("1.Print Full names");
            System.out.println("2.Print Male Students");
            System.out.println("3.Print all female students who has mark greater then 50.4");
            System.out.println("4.Print student information having the minimal mark");
            System.out.println("5.Print biggest male student information");
            System.out.println("6.Print students sorted by mark");
            System.out.println("7.Print female students sorted by year");
            System.out.println("8.Exit");
            Scanner x=new Scanner(System.in);
            int cmd=x.nextInt();
            switch (cmd){
                case 1:
                    service.prinFullNames(b);
                    break;
                case 2:
                    service.maleStnds(b);
                    break;
                case 3:
                    service.femalesWith504mrk(b);
                    break;
                case 4:
                    service.prntMinMarkStndInfo(b);
                    break;
                case 5:
                    service.PrintBgstMlInfo(b);
                    break;
                case 6:
                    service.SortStudents(b);
                    break;
                case 7:
                    service.SortedFemsByYear(b);
                    break;
                case 8:
                    menuActive=false;
                    break;
                default:
                    System.out.println("Invalid Command Number");

            }

        }
    }

    static Student[] read(String path) throws IOException {
        String[] a=Files.readAllLines(Paths.get(path)).toArray(new String[0]);
        Student[] c = new Student[a.length];
        for (int i = 0; i < a.length; i++) {
            Student b=new Student();
            int k=0;
            for (int j = k; j <a[i].length(); j++) {
                if(a[i].charAt(j)!=',')continue;
                b.setName(a[i].substring(k,j));
                k=++j;
                break;
            }
            for (int j = k; j <a[i].length() ; j++) {
                if(a[i].charAt(j)!=',')continue;
                b.setLname(a[i].substring(k,j));
                k=++j;
                break;
            }
            for (int j = k; j < a[i].length(); j++) {
                if(a[i].charAt(j)!=',')continue;
                b.setYear(Integer.parseInt(a[i].substring(k,j)));
                k=++j;
                break;
            }

                b.setGender(a[i].charAt(k));
                k+=2;
                int r=a[i].length();
                b.setMark(Double.parseDouble(a[i].substring(k,r)));
            c[i]=b;
            }
        return  c;
        }

    }

