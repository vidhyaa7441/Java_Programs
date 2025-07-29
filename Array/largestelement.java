import java.util.*;
class largestelement
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
        int l=arr[0];
        for(int num:arr)
        {
            if(num>l)
            {
                l=num;
            }
        }
        System.out.print("The largest element in an array : "+l);
    }
}