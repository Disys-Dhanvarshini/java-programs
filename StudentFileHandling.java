package filehandling2;
import java.io.*;
import java.util.*;
class StudentFileHandling implements Serializable {
	int Student_rollno,Student_age;
	String Student_name,Student_emailid,Student_phoneno;
	StudentFileHandling(int Student_rollno,String Student_name, int Student_age,String Student_emailid,String Student_phoneno){
		this.Student_rollno = Student_rollno;
		this.Student_name = Student_name;
		this.Student_age = Student_age;
		this.Student_emailid = Student_emailid;
		this.Student_phoneno = Student_phoneno;
	}
	public String toString() {
		return Student_rollno+" "+Student_name+" "+Student_age+" "+Student_emailid+" "+Student_phoneno;
	}
}
class Student_file{
	public static void main(String args[])throws Exception
	{
		int choice=-1;
		do {
			Scanner sc = new Scanner(System.in);
			ArrayList<StudentFileHandling> arr = new ArrayList<StudentFileHandling>();
			File file = new File("Student_records.txt");
			ObjectOutputStream obj = null; 
			ObjectInputStream obj1 = null;
			ListIterator obj2 = null;
			if(file.isFile())
			{
				obj1 = new ObjectInputStream(new FileInputStream(file));
				arr = (ArrayList<StudentFileHandling>)obj1.readObject();
				obj1.close();
			}
		    System.out.println("0.EXIT");
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.DISPLAY PARTICULAR RECORD");
			System.out.println("4.DELETE PARTICULAR RECORD");
			System.out.println("5.INSERT AFTER PARTICULAR RECORD");
			System.out.println("ENTER YOUR CHOICE:");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.print("Enter the number of record to be added");
				int n = sc.nextInt();
				for(int i =1; i<=n; i++) {
				System.out.println("Enter the Roll No");
				int Student_rollno = sc.nextInt();
				System.out.println("Enter the Student Name");
				String Student_name = sc.next();
				System.out.println("Enter the age of the student");
				int Student_age = sc.nextInt();
				System.out.println("Enter the student email");
				String Student_emailid = sc.next();
				System.out.println("Enter the student phone number");
				String Student_phoneno = sc.next();
				arr.add(new StudentFileHandling(Student_rollno,Student_name,Student_age,Student_emailid,Student_phoneno));
				}
				obj = new ObjectOutputStream(new FileOutputStream(file));
				obj.writeObject(arr);
				obj.close();
				break;
			}
			case 2:{
				obj2 = arr.listIterator();
				while(obj2.hasNext()) {
		          System.out.println(obj2.next());
				}
			break;	
			}
			case 3:
			{
				if(file.isFile()) {
				System.out.println("Enter the student roll no");
				int Student_rollno = sc.nextInt();
				obj2 = arr.listIterator();
				while(obj2.hasNext()) {
					StudentFileHandling s = (StudentFileHandling)obj2.next();
					if(s.Student_rollno == Student_rollno)
					 System.out.println(s);
				}
				}
				else {System.out.println("File doesnot exist");}
				break;
				}
			case 4:
			{
				System.out.println("Enter the student roll no");
				int Student_rollno = sc.nextInt();
				obj2 = arr.listIterator();
				while(obj2.hasNext()) {
					StudentFileHandling s = (StudentFileHandling)obj2.next();
					if(s.Student_rollno == Student_rollno)
						obj2.remove();
					    obj = new ObjectOutputStream(new FileOutputStream(file));
					    obj.writeObject(arr);
					    obj.close();
				}
					    System.out.println(Student_rollno+"Record deleted Successfully");
				break;
			}
			case 5:
			{  System.out.println("Enter at which position you want insert the record");
				int position = sc.nextInt();
				System.out.println("Enter the Roll No");
				int Student_rollno = sc.nextInt();
				System.out.println("Enter the Student Name");
				String Student_name = sc.next();
				System.out.println("Enter the age of the student");
				int Student_age = sc.nextInt();
				System.out.println("Enter the student email");
				String Student_emailid = sc.next();
				System.out.println("Enter the student phone number");
				String Student_phoneno = sc.next();
				arr.add(position,new StudentFileHandling(Student_rollno,Student_name,Student_age,Student_emailid,Student_phoneno));
				obj = new ObjectOutputStream(new FileOutputStream(file));
				obj.writeObject(arr);
				obj.close();
				break;
			}
			}
		}while(choice!=0);
	
}
}
