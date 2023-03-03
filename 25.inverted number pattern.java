import java.util.*;
class Main
{
	public static void main(String[] args)
	{
	    Scanner s= new Scanner(System.in);
	    int i,j,c,count=0,cc=0;
	    System.out.println("enter number of rows:");
	    int n=s.nextInt();
	    System.out.println("enter a number");
	    c=s.nextInt();
       for(i=1;i<=n;i++)
       {
           for(j=1;j<=i;j++)
           {
                 System.out.print(c); 
           }
           c++;
           System.out.println();
       }
       c=c-1;
       for(i=n-1;i>=1;i--)
       {
           c--;
           for(j=1;j<=i;j++)
           {
               System.out.print(c);
           }
           System.out.println();
       }
	}
}

