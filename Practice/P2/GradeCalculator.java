package P2;
import java.util.*;

public class GradeCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the points scored by the student: ");

    if(!scanner.hasNextDouble()){
      System.out.println("The points entered is invalid!");
    }
    Double points = scanner.nextDouble();
    

    if(points < 0 || points > 100){
      System.out.println("The points should be in range from 0 to 100");
    }else{
      String grade = "";
      if(points>=90){
        grade ="A";
      }else if(points>=80){
        grade ="B";
      }else if(points>=70){
        grade ="C";
      }else if(points>=60){
        grade ="D";
      }else{
        grade ="F";
      }
      System.out.println("The letter grade for the student is: "+ grade);
    }
    scanner.close();

  }
  
}
