import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int newelement1=sc.nextInt();
        int newelement2=sc.nextInt();
        int newelement3=sc.nextInt();
        int pos=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] newarr=new int[arr.length+2];
        newarr[0]=newelement2;//insert at begin
        for(int i=0;i<arr.length;i++)
        {
            newarr[i+1]=arr[i];
        }
        newarr[newarr.length-1]=newelement1;//insert at end
        System.out.println(Arrays.toString(newarr));

        
    }
}