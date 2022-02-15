import java.util.Scanner;
public class electricitybill {
		private int Consumer_no,previous_month_reading, current_month_reading;
		private String consumer_name, type_of_EB;
		private double bill=0;
		public int getConsumerno() {return Consumer_no;}
		public String getconsumername() {return consumer_name;}
		public int getpreviousmonthreading() {return previous_month_reading;} 
		public int getcurrentmonthreading() {return current_month_reading;}
		public String gettype() {return type_of_EB;}
		public void setConsumerno(int no) {Consumer_no= no;}
		public void setconsumername(String name) {consumer_name = name;}
		public void setprevious(int previous) {previous_month_reading = previous;} 
		public void setcurrent(int current) {current_month_reading = current;}
		public void settype(String type) {type_of_EB = type;}
		public void display()
		{
		if(type_of_EB.equals("domestic"))
		 {
			if(current_month_reading<=100)
			{
			bill = current_month_reading*1;
			}
			else if(current_month_reading>=101 && current_month_reading<=200) {
				bill = (100*1)+((current_month_reading-100)*2.50);
			}
			else if(current_month_reading>=201 && current_month_reading<=500) {
				bill = (100*1)+(100*2.50)+((current_month_reading-200)*4);
				}
			else if(current_month_reading>=501)
			{
				bill = (100*1)+(100*2.50)+(300*4)+((current_month_reading-500)*6);
			}
		 }
		 else if(type_of_EB.equals("commercial")) {
			 if(current_month_reading<=100)
			 {
					bill = current_month_reading*2;
					}
					else if(current_month_reading>=101 && current_month_reading<=200) {
						bill = (100*2)+((current_month_reading-100)*4.50);
					}
					else if(current_month_reading>=201 && current_month_reading<=500) {
						bill = (100*2)+(100*4.50)+((current_month_reading-200)*6);
						}
					else if(current_month_reading>=501)
					{
						bill = (100*2)+(100*4.50)+(300*6)+((current_month_reading-500)*7);
					}
		 }
		 System.out.print("THE ELECTRICITY BILL IS "+bill);
		}

public static void main(String[]args) {
electricitybill eb = new electricitybill();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the consumer no");
eb.setConsumerno(sc.nextInt());
eb.getConsumerno();
System.out.println("Enter the consumer name");
eb.setconsumername(sc.next());
System.out.println("Enter the previous month readings");
eb.setprevious(sc.nextInt());
System.out.println("Enter the current month readings");
eb.setcurrent(sc.nextInt());
System.out.println("Enter the type");
eb.settype(sc.next());
eb.display();
}
}


		
	

