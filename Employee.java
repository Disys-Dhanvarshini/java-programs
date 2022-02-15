package employee;
import java.util.Scanner;
public class Employee {
	Scanner sc = new Scanner(System.in);
  int emp_id;
  String emp_name,address,mail_id;
  long mobile_no;
  public void GetInput() {
	  System.out.println("Enter the employee name");
	  emp_name = sc.next();
	  System.out.println("Enter the employee id");
	  emp_id = sc.nextInt();
	  System.out.println("Enter the employee mail id");
	  mail_id= sc.next();
	  System.out.println("Enter the employee mobile number");
	  mobile_no = sc.nextLong();
	  System.out.println("Enter the address");
	  address = sc.next();
  }
  public void display() {
	  System.out.println("**************************************");
	  System.out.println("Employee name: "+emp_name);
	  System.out.println("Employee id: "+emp_id);
	  System.out.println("Employee mail id: "+mail_id);
	  System.out.println("Employee mobile number: "+mobile_no);
	  System.out.println("Address: "+address);
  }
}
class Programmer extends Employee{
	double salary,bp,da,hra,pf,club,net,gross; 
	public void GetProgrammer()
	{
	System.out.println("Enter basic pay");
	bp = sc.nextDouble();
	} 
	void CalculateProgrammer()
	{
	da=(0.97*bp);
	hra=(0.10*bp);
	pf=(0.12*bp);
	club=(0.1*bp);
	gross=(bp+da+hra);
	net=(gross-pf-club);
	System.out.println("********************************************");
	System.out.println("Basic Pay: Rs. "+bp);
	System.out.println("DA: Rs. "+da);
	System.out.println("HRA: Rs. "+hra);
	System.out.println("PF: Rs. "+pf);
	System.out.println("CLUB: Rs. "+club);
	System.out.println("GROSS PAY: Rs. "+gross);
	System.out.println("NET PAY: Rs. "+net); 
}
}
class AssistantProfessor extends Employee{
	double salary,bp,da,hra,pf,club,net,gross; 
	public void GetAsProfessor()
	{
	System.out.println("Enter basic pay");
	bp = sc.nextDouble();
	} 
	void CalculateAsProfessor()
	{
	da=(0.97*bp);
	hra=(0.10*bp);
	pf=(0.12*bp);
	club=(0.1*bp);
	gross=(bp+da+hra);
	net=(gross-pf-club);
	System.out.println("********************************************");
	System.out.println("Basic Pay: Rs. "+bp);
	System.out.println("DA: Rs. "+da);
	System.out.println("HRA: Rs. "+hra);
	System.out.println("PF: Rs. "+pf);
	System.out.println("CLUB: Rs. "+club);
	System.out.println("GROSS PAY: Rs. "+gross);
	System.out.println("NET PAY: Rs. "+net); 
	}	
}
class AssociateProfessor extends Employee{
	double salary,bp,da,hra,pf,club,net,gross; 
	public void Get_Associate_Professor()
	{
	System.out.println("Enter basic pay");
	bp = sc.nextDouble();
	} 
	void Calculate_Associate_Professor()
	{
	da=(0.97*bp);
	hra=(0.10*bp);
	pf=(0.12*bp);
	club=(0.1*bp);
	gross=(bp+da+hra);
	net=(gross-pf-club);
	System.out.println("********************************************");
	System.out.println("Basic Pay: Rs. "+bp);
	System.out.println("DA: Rs. "+da);
	System.out.println("HRA: Rs. "+hra);
	System.out.println("PF: Rs. "+pf);
	System.out.println("CLUB: Rs. "+club);
	System.out.println("GROSS PAY: Rs. "+gross);
	System.out.println("NET PAY: Rs. "+net); 
}
}
class Professor extends Employee{
	double salary,bp,da,hra,pf,club,net,gross; 
	public void Get_Professor()
	{
	System.out.println("Enter basic pay");
	bp = sc.nextDouble();
	} 
	void Calculate_Professor()
	{
	da=(0.97*bp);
	hra=(0.10*bp);
	pf=(0.12*bp);
	club=(0.1*bp);
	gross=(bp+da+hra);
	net=(gross-pf-club);
	System.out.println("********************************************");
	System.out.println("Basic Pay: Rs. "+bp);
	System.out.println("DA: Rs. "+da);
	System.out.println("HRA: Rs. "+hra);
	System.out.println("PF: Rs. "+pf);
	System.out.println("CLUB: Rs. "+club);
	System.out.println("GROSS PAY: Rs. "+gross);
	System.out.println("NET PAY: Rs. "+net); 
}
}
class salary{
  public static void main(String args[]) {
	  int choice;
	  Scanner sc = new Scanner(System.in);
	  Employee e = new Employee();
	  Programmer p = new Programmer();
	  AssociateProfessor asp = new AssociateProfessor();
	  AssistantProfessor ap = new AssistantProfessor();
	  Professor pf = new Professor(); 
    System.out.println("1.Programmer");
    System.out.println("2. Assistant Professor");
    System.out.println("Enter the choice");
    choice = sc.nextInt();
	  switch(choice)
	  {
	  case 1:
	  {
		  System.out.println("PROGRAMMER");
		  e.GetInput();
		  e.display();
		  p.GetProgrammer();
		  p.CalculateProgrammer();  
	  }
	  case 2:
		  {
			  System.out.println("ASSISTANT PROFESSOR");
			  e.GetInput();
			  e.display();
			ap.GetAsProfessor();
			ap.CalculateAsProfessor();
		  }
	  case 3:
	  {
		  System.out.println("ASSOCIATE PROFESSOR");
		  e.GetInput();
		  e.display();
		  asp.Get_Associate_Professor();
		  asp.Calculate_Associate_Professor();
	  }
	  case 4:
	  {
		  System.out.println("PROFESSOR");
		  e.GetInput();
		  e.display();
		  pf.Get_Professor();
		  pf.Calculate_Professor();
	  }
	  }
  }
}
