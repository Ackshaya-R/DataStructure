import java.util.*;
class deletebeginandend
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
        int[] newarr=new int[arr.length-2];
        for(int i=1;i<arr.length-1;i++)
        {
            newarr[i-1]=arr[i];
        }
        System.out.println(Arrays.toString(newarr));
    }
}
