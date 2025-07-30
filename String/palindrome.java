import java.util.*;
class palindrome
{
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=v.nextLine();
        String reversed=new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(reversed));
    }
}