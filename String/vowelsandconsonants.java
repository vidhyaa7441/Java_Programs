import java.util.*;
class vowelsandconsonants
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=obj.nextLine();
        int v=0,c=0;
        for(char ch:s.toCharArray())
        {
            if("aeiouAEIOU".indexOf(ch)!=-1)
            {
                v++;
            }
            else if(Character.isLetter(ch))
            {
                c++;
            }
        }
        System.out.println("Vowels Count : "+v+ ", Consonants Count: "+c);
    }
}