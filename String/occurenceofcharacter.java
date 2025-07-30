import java.util.*;
class occurenceofcharacter
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=obj.nextLine();
        System.out.print("Enter a charcater: ");
        char ch=obj.next().charAt(0);
        int count=0;
        for(char c:s.toCharArray())
        {
            if (c==ch)
            {
                count++;
            }
        }
        System.out.println("Count of the occurance: "+count);
    }
}