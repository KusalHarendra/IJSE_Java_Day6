public class RecursiveMethod1 {
    public static void myMethod(){  
		System.out.println("Start myMethod");
		myMethod();             //never stopped
		System.out.println("End myMethod");
	}
	public static void main(String args[]){
		myMethod();
	}

}
