package factorial;
import java.util.Scanner;
public class factorial {
	public static void main(String[]args) {
		int input,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		input = sc.nextInt();
		if(input>=0)
		{
			
			for(int i=1;i<=input;i++)
			{
				fact*=i;		
			}
			
			System.out.print("The factorial of n is " +fact);	
		}
		else {
			System.out.print("The given number is  negative");
		}
	}
}
