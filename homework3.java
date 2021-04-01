public class homework3
{
    public static void main(String[] args)
    {
        System.out.println("1.Create an array and fill it with 2 number.\n");
        int[] arr1=new int[7];
        for(int i=0;i<arr1.length;i++)
            arr1[i]=2;

        System.out.println("2.Create an array and fill it with numbers from 1:1000.\n");
        int[] arr2=new int[1000];
        for(int i=0;i<arr2.length;i++)
            arr2[i]=i+1;
        System.out.println("3.Create an array and fill it with odd numbers from -20:20\n");
        int[] arr3=new int [20];
        for (int i = 0,j=-19; i <arr3.length ; i++,j+=2) {
            arr3[i]=j;
        }
        System.out.println("4.Create an array and fill it. Print all elements which can be divided by 5.\n");
        int[] arr4={3,5,1,5,6,10,23,25,20,93,95,100};
        for (int i = 0; i < arr4.length; i++) {
            if(arr4[i]%5==0) System.out.println(arr4[i]);
        }
        System.out.println("5.Create an array and fill it. Print all elements which are between 24.12 and 467.23");
        double[] arr5={1,2.7,102,54.2,513.2,5,7.3,444,251.012};
        for (int i = 0; i <arr5.length ; i++) {
            if(arr5[i]<467.23 && arr5[i]>24.12) System.out.println(arr5[i]);
        }
        System.out.println("6.Create an array and fill it. Print count of elements which can be divided by 2.\n");
        int[] arr6={5,4,2,3,6,3,1,19,20,3,16,24,12,0,512,45,56};
        int count=0;
        for (int i = 0; i < arr6.length; i++) {
            if(arr6[i]%2==0)count++;
        }
        System.out.println(count);

        System.out.println("7.Given an integer, 0< N < 21 , print its first 10 multiples. \n" +
                "Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.\n");
        int N=9;
        for (int i = 1; i <11 ; i++) {
            System.out.println(N+" x "+i+" = "+N*i);
        }

        }
    }

