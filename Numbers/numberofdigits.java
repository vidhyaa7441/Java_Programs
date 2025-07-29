import java.util.*;
class numberofdigits
{
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=v.nextInt();
        int count=String.valueOf(num).length();
        System.out.println("Number of digits: "+count);
        
    }
}