public class MethodOverloading2 {
    public static void printTotal(int num1, int num2){  //two parameters
		int total = num1+ num2;
		System.out.println("Total : " + total);
	}

	public static void printTotal(int num1, int num2, int num3){    //three parameters
		int total = num1+ num2 + num3;
		System.out.println("Total : " + total);
	}
	public static void main(String args[]){
		printTotal(10, 20);     //legal
		printTotal(10, 20, 30); //legal
	}

}
