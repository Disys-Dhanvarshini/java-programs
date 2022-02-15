package trianglepattern;
import java.util.Scanner;
public class PrintTriangles {
	public static void print_triangle(int numRows) {
		if(numRows!=0){
			
			for (int i=1; i<=numRows; i+=2){
				for (int k=0; k < (4 - i / 2); k++){
	                 System.out.print(" ");
				}
	            int number = 1;
	            for (int j=0; j <(i/2); j++){
	                System.out.print(number);
	                number *= 2;
	            }
	            for (int j= (i/2); j < i; j++){
	                System.out.print(number);
	                number /= 2;
	            }
	            System.out.println("");
	        }
		
		}
	}
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows");
	int n = sc.nextInt();
	print_triangle(n);
	sc.close();
}
}
