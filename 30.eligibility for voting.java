import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter the age:");
int y=sc.nextInt();
if(y>18)
{
    System.out.println("the person is eligible for voting.");
}
else{
    System.out.println("the person is not eligible for voting\nno.of years left for eligible = "+(18-y));
}
	}
}

