package Students;

public class StudentService extends Student{
    public void prinFullNames(Student[] stnds){
        for (int i = 0; i < stnds.length; i++) {
            System.out.println("Name:"+stnds[i].getName()+" Surname:"+stnds[i].getLname());
        }
    }
    public void maleStnds(Student[] stnds){
        for (int i = 0; i < stnds.length; i++){
            if(stnds[i].getGender()=='m')stnds[i].PrintInfo();
        }
    }
    public void femalesWith504mrk(Student[] stnds){
        for (int i = 0; i < stnds.length; i++){
            if(stnds[i].getGender()=='f' && stnds[i].getMark()>50.4)stnds[i].PrintInfo();
        }
    }
    public void prntMinMarkStndInfo(Student[] stnds){
        Student min=stnds[0];
        for (int i = 1; i <stnds.length ; i++) {
            if (stnds[i].getMark()<min.getMark())min=stnds[i];
        }
        min.PrintInfo();
    }
    public void PrintBgstMlInfo(Student[] stnds){
        Student max=stnds[0];
        int k=0;
        for (int i = 0; i < stnds.length; i++) {
            if (stnds[i].getGender()=='m'){
                k=i;
                break;
            }
        }
        for (int i = k; i <stnds.length ; i++) {
            if (stnds[i].getYear()<max.getYear() && stnds[i].getGender()=='m')max=stnds[i];
        }
        max.PrintInfo();
    }
    public void SortStudents(Student[] students){
        boolean isActive=true;
        while (isActive){
            Student temp;
            isActive=false;
            int fors=0;
            for (int i = 0; i <students.length-1-fors ; i++) {
                if(students[i].getMark()>students[i+1].getMark()){
                    temp=students[i];
                    students[i]=students[i+1];
                    students[i+1]=temp;
                    isActive=true;
                }
            }
        }
        System.out.print("Students Sorted by mark Ascending {");
        for (int i = 0; i <students.length ; i++) {
            System.out.print(students[i].getName()+",");
        }
        System.out.print("}\n");
    }
    public void SortedFemsByYear(Student[] students){boolean isActive=true;
        while (isActive){
            Student temp;
            isActive=false;
            int fors=0;
            for (int i = 0; i <students.length-2-fors ; i++) {
                if(students[i].getYear()<students[i+1].getYear()){
                    temp=students[i];
                    students[i]=students[i+1];
                    students[i+1]=temp;
                    isActive=true;
                }
            }
        }
        System.out.print("Female Students Sorted by Age Descending {");
        for (int i = 0; i <students.length ; i++) {
            if(students[i].getGender()=='f')System.out.print(students[i].getName()+",");
        }
        System.out.print("}\n");
    }

}
