import java.util.*;
class removeduplicates
{
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n=v.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=v.nextInt();
        }
        HashSet<Integer>x=new HashSet<>();
        for(int num:arr)
        {
            x.add(num);
        }
        System.out.println(x);
    }
}