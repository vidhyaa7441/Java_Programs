import java.util.*;
public class rangeprimenumber
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a starting range:");
        int x=s.nextInt();
        System.out.print("Enter a ending range:");
        int y=s.nextInt();
        for (int num = x; num <= y; num++) {
            if (num < 2)
                continue;
            int i=2;
            for (; i * i <= num; i++) {
                if (num % i == 0)
                    break;
            }
            if (i * i > num)
                System.out.print(num + " ");
        }
    }
}
