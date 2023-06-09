public class Example9 {
    public static void myMethod(int num){
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");

		if(num > 100)
			return;

		System.out.println("D");
		System.out.println("E");
	}
	public static void main(String args[]){
		myMethod(101);
	}

}
