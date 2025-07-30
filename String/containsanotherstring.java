import java.util.*;
class containsanotherstring
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1=obj.nextLine();
        System.out.println("Enter second string: ");
        String s2=obj.nextLine();
        System.out.println(s1.contains(s2));
}