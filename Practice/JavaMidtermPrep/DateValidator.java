package JavaMidtermPrep;

import java.util.*;

public class DateValidator{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a date (format: mm/dd/yyyy): ");
		String date = scanner.nextLine();
		
		int month = Integer.parseInt(date.split("/")[0]);
		int day  = Integer.parseInt(date.split("/")[1]);
		int year = Integer.parseInt(date.split("/")[2]);
		
		Boolean isValidMonth = (month >=1 && month<=12);
		Boolean isValidYear = year > 0;
		
		int validDay;
		switch(month){
			case 2: 
				validDay = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				validDay = 30;
				break;
			default:
				validDay = 31;			
		}
		
		Boolean isValidDay = (day >= 1 && day <= validDay) ;
		Boolean isDateValid = (isValidMonth && isValidYear && isValidDay);
		
		System.out.println(month + " is " + (isValidMonth?"a VALID":"an INVALID") + " month." );
		System.out.println(day + " is " + (isValidDay?"a VALID":"an INVALID") + " day.");
		System.out.println(year + " is " + (isValidYear?"a VALID":"an INVALID") + " year.");
		System.out.println(date + " is " + (isDateValid?"a VALID":"an INVALID") + " date.");
		
		scanner.close();
	}
	
}