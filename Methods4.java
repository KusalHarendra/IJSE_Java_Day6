public class Methods4 {
    public static int increment(int x){
		x++;
		return x;
	}
	public static void main(String args[]){
		int x = 100;
		System.out.println(x);  //prints 100
		x = increment(x);
		System.out.println(x);  //prints 101
	}

}
