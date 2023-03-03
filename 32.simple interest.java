import java.util.*;
class calculate
{
    void interest(int p,int t,int r)
    {
        System.out.println((p*t*r)/100);
    }
}
class Main
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principal amount and time:");
        int p=sc.nextInt();
        int t= sc.nextInt();
        int r;
        calculate c=new calculate();
        System.out.println("is the customer senior citizen(y/n):");
        char cu=sc.next().charAt(0);
       if(cu=='y')
       {
          r=12;
          System.out.println("simple interest:");
          c.interest(p,t,r);
       }
       else
       {
           r=10;
          System.out.println("simple interest:");
          c.interest(p,t,r);
       }
    }
}