import java.util.*;
class composite
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first and last terms:");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int i,j,count=0;
        System.out.println("composite numbers between "+a+" and "+b+" is:");
        for(i=a;i<b;i++)
        {
            for(j=1;j<=i;j++)
            {
             if(i%j==0)
             {
                 count=count+1;
             }
            }
            if(count>2)
            {
                System.out.print(" "+i);
            }
        }
    }
}