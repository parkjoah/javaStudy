package JavaMidtermPrep;

import java.util.*;

public class GradeCalculator{
	public static void main(String[] args){
		System.out.print("Enter the points scored by the student: ");
		Scanner sc = new Scanner(System.in);
		
		if(!sc.hasNextDouble()){
			System.out.println("The points entered is invalid!");
			sc.close();
			return;
		}
		Double score = sc.nextDouble();
		
		if(score > 100 || score < 0){
			System.out.println("The points should be in the range from 0 to 100.");
		}else{
			String grade = "";
			if(score <= 100 && score >= 90){
			grade = "A";
			}else if(score >= 80){
				grade = "B";
			}else if(score >= 70){
				grade = "C";
			}else if(score >= 60){
				grade = "D";
			}else{
				grade = "F";
			}
		
			System.out.println("The letter grade for the student is: " + grade);
		
		}
		
		
		sc.close();
	}
}