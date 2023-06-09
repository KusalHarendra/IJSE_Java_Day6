public class Example10 {
    public static void myMethod(int num){
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		return;
		//System.out.println("D"); // Illegal
		//System.out.println("E"); // Illegal
	}
	public static void main(String args[]){
		myMethod(101);
	}

}
