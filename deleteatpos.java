import java.util.*;
class deleteatpos
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] newarr=new int[arr.length-1];
        for(int i=0;i<pos;i++)
        {
            newarr[i]=arr[i];
        }
        for(int i=pos+1;i<arr.length;i++)
        {
            newarr[i-1]=arr[i];
        }
        System.out.println(Arrays.toString(newarr));
    }
}

