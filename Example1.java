//-------------Example.class-----------------
class Example{
	public static void main(String args[]){
		//myMethod(); // Illegal
		MyClass.myMethod();
	}
}
//-------------MyClass.class-----------------
class MyClass{
	public static void myMethod(){
		System.out.println("myMethod in MyClass");
	}
}
