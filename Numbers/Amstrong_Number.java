import java.util.*;
class Amstrong_Number
{
    public static void main(String[] args)
    {
        Scanner c=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=c.nextInt();
        int count=0;
        int temp=num;
        while(temp!=0)
        {
            count++;
            temp/=10;
        }
        temp=num;
        int sum=0;
        while(temp!=0)
        {
            sum+=power(temp%10,count);
            temp/=10;
        }
        if(num==sum)
        {
            System.out.print("Amstrong Number");
        }
        else
        {
            System.out.print("Not a Amstrong Number");
        }
    }
    public static int power(int base,int exp)
    {
        int i,res=1;
        for(i=1;i<=exp;i+=1)
        {
            res *= base;
        }
        return res;
    }
}
