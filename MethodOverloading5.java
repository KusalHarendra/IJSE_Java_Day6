public class MethodOverloading5 {
    public static void myMethod(int i){
		System.out.println("myMethod(int)");
	}

	public static void myMethod(int i, int j){ // Legal --> Different parameters
		System.out.println("myMethod(int, int)");
	}

	public static void myMethod(int i, int j, int k){ // Legal --> Different parameters
		System.out.println("myMethod(int, int, int)");
	}
	public static void main(String args[]){
		
	}

}
