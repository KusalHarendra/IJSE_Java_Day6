class Example3{
	public void myMethod(){     //non static method
		System.out.println("myMethod in Example");
	}
	public static void main(String args[]){
		Example3 ob = new Example3();   //object creation
		ob.myMethod();
	}
}
