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
           for(j=1;j<=i;j++)
           {
               System.out.print(" ");
           }
           for(c=n;c>=i;c--)
           {
               System.out.print(" *");
           }
           System.out.println();
       }
	}
}

