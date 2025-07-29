import java.util.Scanner;
public class remainingdays
{
    public static void main(String[] args)
    {
        Scanner c=new Scanner(System.in);
        System.out.print("Enter date: ");
        int dd=c.nextInt();
        System.out.print("Enter month: ");
        int mm=c.nextInt();
        System.out.print("Enter year: ");
        int yy=c.nextInt();
        int days;
        if(yy>=1000 && yy<=9999)
        {
            if((yy%4==0 && yy%100!=0) || yy%400==0)
            {
                days=366;
            }
            else
            {
                days=365;
            }
            if((dd>=1 && dd<=31) && (mm>=1 && mm<=12))
            {
                int dp=dd+(mm-1)*30;
                int dr=days-dp;
                System.out.printf("Days completed :%d\n",dp);
                System.out.printf("Days remaining :%d",dr);
            }
        }
    }
}