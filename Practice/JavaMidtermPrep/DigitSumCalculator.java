package JavaMidtermPrep;

import java.util.*;

public class DigitSumCalculator{
	public static void main(String[] args){
		System.out.print("Enter a positive integer: ");
		Scanner scanner = new Scanner(System.in);	
		boolean isValid = false;
		
		int num = 0;
		
		while(!isValid){
			if(scanner.hasNextInt()){
				int input = scanner.nextInt();
				if(input<=0){
					System.out.println("Input should be a positive integer. Try again.");
				}else{
					num = input;
					isValid = true;
				}
			}else if(scanner.hasNextFloat()){
				System.out.println("Floating-point number is not allowed. Try again.");
			}else{
				System.out.println("Invalid input. Try again.");
			}
		}
		if(isValid){
			System.out.println("The sum of digits in " + num + " is " + sum(num));
		}
		scanner.close();
	}
	
	public static int sum(int n){
		int sumOfDigits = 0;
		while(n > 0){
			sumOfDigits += n % 10; //마지막 자리...
			n /= 10; // 맨 뒷자리 줄임...
		}
		return sumOfDigits;
	}
	
}