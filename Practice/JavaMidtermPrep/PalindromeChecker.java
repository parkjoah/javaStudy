package JavaMidtermPrep;


import java.util.*;

public class PalindromeChecker{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String text = scanner.nextLine();
		if(text.trim().isEmpty()){
			System.out.println("Empty string. Try again.");
			scanner.close();
			return;
		}
		
		String checkingText = text.replace(" ","").toLowerCase();
		
    String sortedText = "";
		for(int i = checkingText.length()-1; i>=0 ;i--){
			sortedText += checkingText.charAt(i);
		}
		boolean isPalindorme = sortedText.equals(checkingText); 
		
		System.out.print(text + " is " + (isPalindorme ? "a" : "Not a" ) + " palindrome.");
		
		scanner.close();
	}
}