import java.util.*;
class Anagram
{
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1=v.nextLine();
        String s2=v.nextLine();
        char[] a1=s1.toCharArray();
        char[] a2=s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
    }
}