public class Example17 {
    public static int findTotal(int a, int b){
		int total = a+b;
		return total;
	}

	public static void printTotal(int a, int b){
		int total = a+b;
		System.out.println("Total : " + total);
	}
	public static void main(String args[]){
		int total;
		total = findTotal(10, 20); // Legal
		//total = printTotal(10, 20);  // Illegal

		System.out.println("Total : " + findTotal(10, 30));
		//System.out.println("Total : " + printTotal(10, 30)); // Illegal
	}
 
}
