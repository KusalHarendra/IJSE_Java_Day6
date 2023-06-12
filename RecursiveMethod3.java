public class RecursiveMethod3 {
    public static void myMethod(int i){  
		System.out.println("i : " + i);
		if(i<10)
			myMethod(++i);
	}
	public static void main(String args[]){
		myMethod(0);
	}

}
