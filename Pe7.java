import java.util.Scanner;
import java.util.Arrays;

public class Pe7
{
  public static void main(String[] args)
   {

    Scanner inp=new Scanner(System.in);
    int d;
    int i;
    d=inp.nextInt();
    int c=0;
    int sum=0;
    int k=d;
    while(d!=0)
    {
     c++;
     d=d/10;
    } 
int a[] = new int[c];
    


for(i=0;i<c;i++)
{
  if(k!=0)
{
    
   a[i]=k%10;
   if(a[i]%2==0)
     sum=sum+a[i];
   k=k/10;
}
}

Arrays.sort(a);


for(i=c-1;i>=1;i--)
System.out.print(a[i]);

System.out.println(sum);
if(sum>=15)
System.out.println("True");
else
System.out.println("false");
}
}

  
