import java.util.*;

class SumOfDigits{

	public static void printNoOfDigits(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = input.nextInt();

		int count = 0;
		do{
			count++;
		} while ((num /=10) != 0);

		System.out.println("No of Digits : " + count);

	}

	public static void main(String args[]){
		System.out.println("Start main");
		printNoOfDigits(); // method calling statement
		System.out.println("End Main");
	}

}
