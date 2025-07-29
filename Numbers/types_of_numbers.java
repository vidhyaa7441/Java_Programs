import java.util.*;

class Types_of_Numbers
{
    public static void main(String[] args)
    {
        Scanner c=new Scanner(System.in);
        long x=c.nextLong();
        long i,sum=0;
        for(i=1;i*i<x;i+=1)
        {
            if(x%i==0)
                sum+=(i+(x/i));
        }
        sum-=x;
        if(sum<x)
        {
            System.out.printf("Sum is %d and Perfect Number",sum);
        }
        else if (sum>x)
        {
            System.out.printf("Sum is %d and Abundant Number",sum);
        }
        else
        {
            System.out.printf("Sum is %d and Deficiency Number",sum);
        }
    }
}
