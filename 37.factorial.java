import java.util.*;
class Main
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
int fact=1,i;
for(i=1;i<=n;i++)
{
 fact=fact*i;
}
System.out.print("factorial of "+n+" = "+fact);
}
}
