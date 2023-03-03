import java.util.*;
class Main
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
int count=0,i;
for(i=1;i<=n;i++)
{
 if(n%i==0)
 {
     count=count+1;
 }
}
System.out.print("number of factors of "+n+" = "+count);
}
}

