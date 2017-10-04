import java.util.Scanner;

public class Add{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
        int len;
        int i;
        int sum=0;
        len=str.length;
		int a[] = new int[str.length];

	   for(i=0;i<len;i++ )
		{
		
		 a[i]=Integer.parseInt(str[i]);
		 sum=sum+a[i];
		  
		}
		System.out.println(sum);
	}
}
	
