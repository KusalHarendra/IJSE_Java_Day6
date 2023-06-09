public class Example6 {
    public static void myMethod(int a, int b){
		System.out.println("myMethod(int,int)");        //pass two parameters
	}
	public static void main(String args[]){
		//myMethod(10); // Illegal
		myMethod(10, 20);       //can pass only two arguments
		//myMethod(10, 20, 30); // Illegal
	}
 
}
