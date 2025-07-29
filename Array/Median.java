import java.util.*;
public class Median
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int x=s.nextInt();
        System.out.print("Enter first array elements: ");
        int n1[]=new int[x];
        for(int i=0;i<x;i++)
        {
            n1[i]=s.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int y=s.nextInt();
        System.out.print("Enter second array elements: ");
        int n2[]=new int[y];
        for(int i=0;i<y;i++)
        {
            n2[i]=s.nextInt();
        }
        int m[]=new int[x+y];
        for(int i=0;i<n1.length;i++)
        {
            m[i]=n1[i];
        }
        for(int i=0;i<n2.length;i++)
        {
            m[x+i]=n2[i];
        }
        Arrays.sort(m);
        int z=m.length;
        if(z%2!=0)
        {
            System.out.print("Median : "+m[z/2]);
        }
        else
        {
            System.out.print("Median : "+(m[z/2]+m[z/2 -1])/2.0);
        }
    }
}
