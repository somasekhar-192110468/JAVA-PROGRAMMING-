import java.util.*;
class Main
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the first and last terms:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("enter number of terms to be skipped:");
int k=sc.nextInt();
for(int i=a;i<=b;i++)
{
 System.out.print(i+" ");
 i=i+k;
}
}
}
