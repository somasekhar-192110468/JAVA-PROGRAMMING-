import java.util.*;
class Main
{
	public static void main(String[] args)
	{
	    Scanner s= new Scanner(System.in);
	    int a[]=new int[20];
	    int i,j,c,count=0,cc=0;
	    System.out.println("enter number of elements in array:");
	    int n=s.nextInt();
	    System.out.println("enter elements in array:");
	    for(i=0;i<n;i++)
	    {
	        a[i]=s.nextInt();
	    }
	    for(i=0;i<n;i++)
	    {
	        c=a[i];
	        count=0;
        for(j=1;j<=c;j++)
        {
            if(c%j==0)
            {
            count=count+1;    
            }
        }
        if(count>2)
        {
            cc=cc+1;
        }
	    }
		System.out.println("number of composite numbers = "+cc);
	}
}
