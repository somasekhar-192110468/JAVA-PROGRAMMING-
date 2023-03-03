import java.util.*;
class Main 
{
    public static void main(String [] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in array:");
        int n= sc.nextInt();
        int a[]=new int[n+1];
        int i,j;
        System.out.println("enter the elements of array:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                for(j=n-1;j>=i;j--)
                {
                    a[j+1]=a[j];
                }
            }
            i=i+1;
        }
       System.out.println("after duplication the elements of array:");
        for(i=0;i<n;i++)
        {
           System.out.print(" "+a[i]);
        } 
    }
}