import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] rev_arr=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            rev_arr[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(rev_arr));
    }
}