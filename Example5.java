public class Example5 {
    public static void myMethod(int a, int b){
		int total = a+b; // Legal
		
		//int a; // Illegal
		//int b; // Illegal

		int c;
	}
	public static void main(String args[]){
		myMethod(10, 20);
	}

}
