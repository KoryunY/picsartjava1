public class home2
{
    public static void main(String[] args)
    {
        int a=2,b=3;
        System.out.println(a+b);
        System.out.println(--b%a);
        a++;
        if(a==b)System.out.println(b*b);
        else System.out.println(a*b);
        b*=b;
        if(a<b&&b==4)System.out.println(a&b);
        int[] arr1={1,3,4,5,4,5,1};//kent tvov elementy zangvacum
        System.out.println(arr1[0]^arr1[1]^arr1[2]^arr1[3]^arr1[4]^arr1[5]^arr1[6]);
    }
}
