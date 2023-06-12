public class Methods {
    public static void mA(){
		System.out.println("Start mA"); //2
		mB();
		System.out.println("End mA");   //7
	}

	public static void mB(){
		System.out.println("Start mB"); //3
		mC();
		System.out.println("End mB");   //6
	}

	public static void mC(){
		System.out.println("Start mC"); //4
		System.out.println("End mC");   //5
	}
	
	public static void main(String args[]){
		System.out.println("Start Main"); //1
		mA();
		System.out.println("End Main");   //8
	}

}
