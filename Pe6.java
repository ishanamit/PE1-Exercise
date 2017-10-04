import java.util.Scanner;
 public class Pe6
  {
   
   public static void main(String[] args)
   {

     Scanner inp=new Scanner(System.in);
     char a=inp.next().charAt(0);
     int ascii = (int) a;

  if(ascii>='a' && ascii<='z')
  System.out.println("small letter");

  else if(ascii>'A' && ascii<'Z')
  System.out.println("Capital letter");

  else if(ascii>'0' && ascii<'9')
  System.out.println("digit");
}
}





