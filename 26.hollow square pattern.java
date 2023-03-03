import java.util.*;
import java.util.*;
class Main
{
	public static void main(String[] args)
	{
	    Scanner s= new Scanner(System.in);
	    int i,j,c,count=0,cc=0;
	    System.out.println("enter number of rows:");
	    int n=s.nextInt();
       for(i=1;i<=n;i++)
       {
           for(j=1;j<=n;j++)
           {
               if(i==1||i==n||j==1||j==n)
               {
                 System.out.print(" *"); 
               }
               else{
                   System.out.print("  ");
               }
           }
           System.out.println();
       }
	}
}

