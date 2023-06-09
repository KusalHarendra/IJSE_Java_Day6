public class Example16 {
    public static int findTotal(int a, int b){
		int total = a+b;
		return total;
	}
	public static void main(String args[]){
		int total = findTotal(10, 20); // Legal

		findTotal(10, 20); // Legal
	}

}
