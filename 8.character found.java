import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the string:");
String str=s.nextLine();
System.out.println("enter a character to be searched:");
char c=s.next().charAt(0);
for(int i=0;i<str.length();i++)
{
  if(c==str.charAt(i))
  {
      System.out.println(c+" is present in the string "+str+" at index "+i);
  }
  }
}
}
