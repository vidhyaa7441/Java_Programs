import java.util.*;
public class reverse_number
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=s.nextInt(),rev=0;
        while(num!=0)
        {
            rev=(rev*10)+num%10;
            num/=10;
        }
        System.out.print("The reversed Number is "+rev);
    }
}
