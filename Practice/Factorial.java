import java.util.*;

public class Factorial{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num=-1;
		boolean isValid = false;
		
		while(!isValid){
			System.out.print("Enter an integer between 0 to 16: ");
			if(scanner.hasNextInt()){
				num = scanner.nextInt();
				if(num < 0){
					System.out.println(num + " is a negative integer. Try again.");
				}else if(num > 16){
					System.out.println(num + " is an integer greater than 16. Try again.");
				}else{ isValid = true;}
			}else if(scanner.hasNextFloat()){
				float floatInput = scanner.nextFloat();
				System.out.println(floatInput + " is a floating-point number. Try again.");
			}else{
				String stringInput = scanner.nextLine();
				System.out.println(stringInput + " is a string. Try again.");
			}
		}
		
		if(isValid){
			System.out.println("The factorial of " + num + " = "+ factorialResult(num));
		}
    scanner.close();
	}
	
	public static long factorialResult(int num){
		
		long factorial = 1;
		if(num != 0 && num !=1){
			for(int i = 1 ; i < num+1 ; i++){
				factorial *= i;
			}
		}
		
		return factorial;
	}
}