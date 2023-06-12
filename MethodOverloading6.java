public class MethodOverloading6 {
    public static void myMethod(int i, double d){ 
		System.out.println("myMethod(int, double)");    
	}

	public static void myMethod(double d, int i){  // Legal
		System.out.println("myMethod(double, int)");
	}
	public static void main(String args[]){
		myMethod(10, 20.0); //diiferent argument types
		myMethod(10.0, 20); //diiferent argument types
	}

}
