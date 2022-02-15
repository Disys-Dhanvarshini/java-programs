package converter;
import java.util.Scanner;
abstract class Converter{
	abstract void display();
	Scanner sc = new Scanner(System.in);
	 double distance,amount;
	 int input;
	 String current_measurement, convert_measurement,current,convert,current_currency,change_currency; 
	 public void distanceconverter() {
		 System.out.println("Enter the distance");
		 distance = sc.nextDouble();
		 System.out.println("Enter the current measurement");
		 current_measurement = sc.next();
		 System.out.println("Enter the converted measurement");
		 convert_measurement= sc.next();
	 if(current_measurement.equals("km"))
	 {
		 if(convert_measurement.equals("meter"))
		 {
			 distance*=1000;
		 }
		 else if(convert_measurement.equals("miles"))
		 {
			 distance/=1.609;
		 }
	 }
	 if(convert_measurement.equals("km"))
	 {
		 if(current_measurement.equals("meter"))
		 {
			 distance/=1000;
 		 }
		 else if(current_measurement.equals("miles"))
		 {
			 distance*=1.609;
		 }
		 }
	 System.out.println("The converted distance is "+distance);
	 } 

public void timeconverter()
{
	System.out.println("Enter the time");
	input = sc.nextInt();
	System.out.println("Enter the current type");
	current = sc.next();
	System.out.println("Enter the type to be converted");
	convert = sc.next();
	if(current.equals("hour"))
	{
		if(convert.equals("minute")) {
			input*=60;
		}
		else if(convert.equals("seconds"))
				{
					input*=3600;
				}
	}
	if(convert.equals("hour"))
	{
		if(current.equals("minute")){
			input/=60;
		}
		else if(current.equals("seconds")) {
			input/=3600;
		}
	}
	System.out.println("The converted time is "+input);
}
public void CurrencyConverter()
{
	System.out.println("Enter the amount");
    amount = sc.nextDouble();
    System.out.println("Enter the currenct currency type");
    current_currency=sc.next();
    System.out.println("Enter the type to be converted");
    change_currency = sc.next();
    if(change_currency.equals("inr"))
    {
    if(current_currency.equals("dollar")) 
    { 
 	   
 	 amount*=74.39;
    }
    else if(current_currency.equals("euro"))
    {
 	  
 	   amount*=84.78;
    }
    else if(current_currency.equals("yen"))
    {
 	   
 	   amount*=0.65;
    }
  }
   if(current_currency.equals("inr"))
   {
     if(change_currency.equals("dollar"))
    {
 	amount/= 74.39;
    }
    else if(change_currency.equals("euro"))
    {
 	  
 	amount/= 84.78;
    }
    else if(change_currency.equals("yen"))
    {
 	amount/= 0.65;
    }
   System.out.println("The converted amount is " +String.format("%.2f",amount)); 
	}
}
}
   class distance extends Converter{
	   public void display() {
   		System.out.println("Converter");
   		}
    public static void main(String[] args) {
    	int choice;
    	String ch;
		distance d = new distance();
		 d.display();
		 do {
		    	Scanner sc = new Scanner(System.in);
			 	System.out.println("1.Distance Converter");
			 	System.out.println("2.Time Converter");
			 	System.out.println("3.Currency Converter");
			 	System.out.println("Enter your choice");
			 	choice = sc.nextInt();
		 switch(choice)
		 {
		 case 1:
		 {
			 d.distanceconverter();
			 break;
		 }
		 case 2:
		 {
		 d.timeconverter();
		 break;
		 }
		 case 3:
		 {
			 d.CurrencyConverter();
			 break;
		 }
	 }
		 System.out.println("Enter Yes if you want to continue");
		 ch=sc.next(); 
		 }
        while(ch.equals("yes"));
    }
}




