import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner s= new Scanner(System.in);
System.out.println("enter the string:");
String str=s.nextLine();
int i;
String rev=" ";
for(i=0;i<str.length();i++)
{
 rev=str.charAt(i)+rev;   
}
System.out.println("the reversed string = "+rev);
}
}
