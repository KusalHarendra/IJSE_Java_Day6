public class Methods5 {
    public static int increment(int x){
		x++;
		return x;
	}
	public static void main(String args[]){
		int x = 100;
		System.out.println(x);  //prints 100
		increment(x);
		System.out.println(x);  //prints 100
		x = increment(x);
		System.out.println(x);  //prints 101
		x = increment(x);
		System.out.println(x);  //prints 102
	}

}
