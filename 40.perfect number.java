
import java.util.*;
class Main
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
int sum=0,i,num;
num=n;
for(i=1;i<n;i++)
{
 if(n%i==0)
 {
     sum=sum+i;
 }
}
if(sum==num)
{
System.out.print(n+" is a perfect number");
}
else{
    System.out.print(n+" is not a perfect number");
}
}
}