import java.util.Scanner;
public class swaptwonumbers {
	public static void main(String[]args) {
		int input1,input2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		input1 = sc.nextInt();
		System.out.println("Enter the second number");
		input2 = sc.nextInt();
		input1 += input2;
		input2 = input1-input2;
		input1 -= input2; 
		System.out.println("First number after swaping" +input1);
		System.out.print("Second number after swaping" +input2);
	}

}
