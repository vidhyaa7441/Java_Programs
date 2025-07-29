import java.util.*;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = obj.nextInt();
        while (num >= 10) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        System.out.println("Sum of the digits until Single digit: "+num);
    }
}