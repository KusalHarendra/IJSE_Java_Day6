public class Example7 {
    public static void myMethod(int a){
		System.out.println("myMethod(int)");
	}
	public static void main(String args[]){
		byte b = 100;
		short s = 100;
		int i = 100;
		long l = 100;
		float f = 100.0f;
		double d = 100.0;
		char ch = 'A';

		myMethod(b);
		myMethod(s);
		myMethod(i);
		//myMethod(l); // Illegal
		//myMethod(f); // Illegal
		//myMethod(d); // Illegal
		myMethod(ch);
	}

}
