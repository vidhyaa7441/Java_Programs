import java.util.*;
public class division_without_operator
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int x=s.nextInt();
        System.out.print("Enter divisor: ");
        int y=s.nextInt();
        int val = 1;

        while (y <= x) {
            x = x - y;
            val++;
        }

        System.out.println(val - 1);
    }
}
