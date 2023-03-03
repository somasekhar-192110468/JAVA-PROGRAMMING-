import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the username:");
String str=s.nextLine();
System.out.println("reenter the username:");
String re=s.nextLine();
if(str==re)
{
    System.out.println("valid username");
}
else
{
    System.out.println("invalid username");
}
}
}

