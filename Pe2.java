import java.util.Scanner;


public class Pe2
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(isPalindrome(input)){
			if(evenSumGreaterThan25(input)){
				System.out.println("Palindrome and greater than 25");
			}
			else System.out.println("Palindrome and less than25");
		}
		else System.out.println("Not a palindrome");
		
	}

	public static boolean isPalindrome(int input){
		//reverted stores the reverted input
		int reverted = 0;
		int num = input;
		while(num != 0){
			reverted = 10*reverted + num%10;
			num /= 10;
		}
		//System.out.println("reverted: " + reverted);
		return reverted == input;
	}

	public static boolean evenSumGreaterThan25(int input){
		int num = input;
		int sum = 0;

		while(num > 0) {
			int ones = num%10;
			if(ones%2 == 0){
				sum += ones;
			}
			num /= 10;
		}
		//System.out.println("sum :" + sum);
		return sum > 25;
	}
}




