import java.util.Scanner;

public class Pe3
{

public static void main(String[] args)
{

Scanner inp=new Scanner(System.in);
int a;
a=inp.nextInt();

if(a>20 && a<30)
{
 if(a%2==0)
  System.out.println("Jerry");
else
System.out.println("Tom");
}
}
}


