import java.util.Scanner;

public class SumofNumbers3 {
    public static void printNoOfDigits(int num){
		int count = 0;
		do{
			count++;
		} while ((num /=10) != 0);

		System.out.println("No of Digits : " + count);
	}

	public static void main(String args[]){
		System.out.println("Start main");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = input.nextInt();

		printNoOfDigits(num); // method calling statement
		System.out.println("End Main");
	}
}



