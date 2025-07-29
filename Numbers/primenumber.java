import java.util.*;
class primenumber
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int i;
        for(i=2;i*i<n;i++)
        {
            if(n%i==0)
                break;
        }
        if(i*i>n){
            System.out.println("It's a Prime Number ");
        }
        else {
            System.out.println("It's not a Prime Number ");
        }
    }
}