import java.util.*;
class fibonacciseries
{
    public static void main(String[] args)
    {
        Scanner v=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=v.nextInt();
        int n1=0,n2=1;
        System.out.print("Fibonacci Series: "+n1+" "+n2);
        for(int i=2;i<num;i++)
        {
            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}