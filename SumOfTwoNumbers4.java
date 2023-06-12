import java.util.*;

class SumOfTwoNumbers4 {

	public static int findSumOfTwoNumbers(int num1, int num2){
		int total = num1 + num2;
		return total;
	}

	public static void main(String args[]){
		System.out.println("Start main");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int num1 = input.nextInt();

		System.out.print("Enter number 2 : ");
		int num2 = input.nextInt();
        
        int total;

		total = findSumOfTwoNumbers(num1, num2);
        System.out.println("Total : " + total); 
		System.out.println("End Main");
	}
}
