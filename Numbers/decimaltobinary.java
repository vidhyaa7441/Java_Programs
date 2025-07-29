import java.util.*;
class decimaltobinary
{
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        System.out.println("Enter a decimal Number: ");
        int num=v.nextInt();
        String b=Integer.toBinaryString(num);
        System.out.println("Equivalent binary value: "+b);
        
    }
}