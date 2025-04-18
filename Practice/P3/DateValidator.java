package P3;
import java.util.*;

public class DateValidator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a date (format: mm/dd/yyyy) : ");

    // scanner로 받아서 '/'기준으로 저장
    String date [] = scanner.next().split("/");
    
    int month = Integer.parseInt(date[0]);
    int day = Integer.parseInt(date[1]);
    int year = Integer.parseInt(date[2]);
    
    Boolean isValidMonth = month>=1 && month<=12;
    int validDay;
    Boolean isValidYear = (year>0);

    // 달 별로 valid Day 기준잡기 !
    switch (month) {
      case 4: 
      case 6:
      case 9:
      case 11:
        validDay = 30;
        break;  
      case 2:
        validDay = 28;
        break;
      default: 
        validDay = 31;  
        break;
    }
    Boolean isValidDay = (day >=1 && day <= validDay );

    //전체 date valid ?
    Boolean isValidDate = isValidDay&&isValidMonth&&isValidYear;

    //출력
    System.out.println(month + " is " + (isValidMonth ? "a VALID " : "an INVALID ") + "month.");
    System.out.println(day + " is " + (isValidDay ? "a VALID " : "an INVALID ") + "day.");
    System.out.println(year + " is " + (isValidYear ? "a VALID " : "an INVALID ") + "year.");
    System.out.println(month+"/"+day+"/"+year+"/" + " is " + (isValidDate ? "a VALID " : "an INVALID ") + "date.");
    scanner.close();
  }
}