import java.util.Scanner;

public class Pe8
{
  public static void main(String[] args)
  {
    Scanner inp=new Scanner(System.in);
    int target=25;
    int d;
    d=inp.nextInt();

   while(d!=target)
    {
     if (d>target)
      {
       System.out.println("Number guessed is more than original number");
       d=inp.nextInt();
      }
     else
     {
       System.out.println("Number guessed is less than original number");
       d=inp.nextInt();
     }
   }
       System.out.println("Number guessed matches the original number");
}
}

        
