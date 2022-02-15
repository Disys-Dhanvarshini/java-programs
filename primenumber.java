package primenumber;
import java.util.Scanner;
public class primenumber {
 public static void main(String[]args) {
	 int input,flag=0;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the number");
	 input = sc.nextInt();
	 if(input==0 || input==1)
	 {
		 System.out.print("The given number is not a prime number");
	 }
	 else if(input>1) {
		 for(int i =1;i<=input;i++)
		 {
			 if(input%i==0)
			 {
				 flag++;
			 }
		 }
			 if(flag>2)
			 {
				 System.out.print("The given number is not a prime number");
			 }
			 else {System.out.print("The given number is a prime number");}
		 }
	 else {System.out.print("The given number is a negative number"); }
	
 }
}
