import java.util.*;
class amicable_numbers
{
    public static void main(String[] args)
    {
        Scanner c=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=c.nextInt();
        System.out.println("Enter second number: ");
        int num2=c.nextInt();
        int i,sum1=1,sum2=1;
        for(i=1;i*i<num1;i+=1)
        {
            if(num1%i==0)
            {
                sum1+=(i+(num1/i));
            }
        }
        for(i=1;i*i<num2;i+=1)
        {
            if(num2%i==0)
            {
                sum2+=(i+(num2/i));
            }
        }
        //System.out.printf("%d %d",sum1,sum2);
        if(sum1==num2 && sum2==num1)
        {
            System.out.print("Ambicable Pair");
        }
        else
        {
            System.out.println("Not Ambicable paris");
        }
    }
}
