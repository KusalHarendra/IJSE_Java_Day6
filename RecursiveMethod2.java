public class RecursiveMethod2 {
    public static void myMethod(int i){  
		System.out.println("i : " + i);
		myMethod(++i);
	}
	public static void main(String args[]){
		myMethod(0);
	}

}
