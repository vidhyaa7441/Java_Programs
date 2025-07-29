import java.util.*;
public class nextprimenumber {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int next = num + 1;
        while (true) {
            if (next > 1) {
                int i;
                for (i = 2; i <= Math.sqrt(next); i++) {
                    if (next % i == 0) {
                        break;
                    }
                }
                if (i > Math.sqrt(next)) {
                    System.out.println("Next prime: " + next);
                    break;
                }
            }
            next++;
        }
    }
}
