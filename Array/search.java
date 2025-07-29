import java.util.*;
class search
{
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int size = c.nextInt();
        int key=c.nextInt();
        int[] sc = new int[size];
        int i;
        for (i = 0; i < size; i += 1)
            sc[i] = c.nextInt();
        for (i = 0; i < size; i += 1)
        {
            if(sc[i]==key)
                break;
        }
        if(i<size)
            System.out.print("Found");
        else
            System.out.print(" Not Found");
    }

}
