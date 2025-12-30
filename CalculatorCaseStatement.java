package Day3;
import java.util.Scanner;

public class CalculatorCaseStatement {

	public static void main(String[] args) {
		System.out.println("Enter the first number.");
		Scanner scanner = new Scanner(System.in); //using scanner class to get input from user 
		double num1= scanner.nextDouble();
		//System.out.println(num1); 
		System.out.println("Enter the second number.");
		double num2 = scanner.nextDouble();
		//System.out.println(num2);
		System.out.println("Choose an operation");
		System.out.println("Choose an operation");
		System.out.println("1- Addition.");
		System.out.println("2- Substraccion.");
		System.out.println("3- Multiplication.");
		System.out.println("4- Division.");
		
		int choice = scanner.nextInt();
		System.out.println(choice);
		switch (choice)
		{
		case 1: System.out.println("The result is "+(num1+num2));
		break;
		case 2: System.out.println("The result is "+(num1-num2));
		break;
		case 3: System.out.println("The result is "+(num1*num2));
		break;
		case 4: 
			if(num2 != 0) {
				System.out.println("The result is "+(num1/num2));
			}
			else {
		    System.out.println("Error: Division by zero is not allowed. ");
			}
		  }
		 }
		}
		


