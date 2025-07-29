import java.util.*;
class powersoftwo
{
    public static void main(String[] args)
    {
        Scanner c=new Scanner(System.in);
        int x=c.nextInt();
        while(x%2==0)
        {
            x=x/2;
        }
        if(x==1)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
        /*if(x &(x-1))
        System.out.print("Yes);
        else
        System.out.print("No");*/
    }
}
