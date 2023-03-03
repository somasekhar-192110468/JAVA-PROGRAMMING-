import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the string:");
String str=s.nextLine();
char c=' ';
int count=0;
System.out.println("vowels:");
for(int i=0;i<str.length();i++)
{
    c=str.charAt(i);
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
    {
     System.out.print(" "+c);   
    }
}
System.out.println("consonants:");
for(int i=0;i<str.length();i++)
{
    c=str.charAt(i);
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
    {
     count = count+1;   
    }
    else
    {
      System.out.print(" "+c);  
    }
}
}
}

