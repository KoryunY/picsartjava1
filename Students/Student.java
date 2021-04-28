package Students;

public class Student {
    private String fname;
    private String lname;
    private int year;
    private char gender;
    private double mark;


    public String getName() {
        return fname;
    }

    public void setName(String name) {
        this.fname = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    public void PrintInfo(){
        System.out.println("______________________________________");
        System.out.println("Name:"+fname);
        System.out.println("Last Name:"+ lname);
        System.out.println("Born In:"+year);
        if(gender=='m')
        System.out.println("Gender: Male");
        else
            System.out.println("Gender:Female");
        System.out.println("Mark:"+mark);
        System.out.println("......................................");
    }
}
