public class Methods2 {
    public static void increment(){
		int x = 100;
		x++;
	}
	
	public static void main(String args[]){
		int x = 100;
		System.out.println(x);  //prints 100
		increment();
		System.out.println(x);  //prints 100
	}

}
