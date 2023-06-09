//-------------Example.class-----------------
class Example2{
	public static void myMethod(){
		System.out.println("myMethod in Example");
	}
	public static void main(String args[]){
		myMethod();
		MyClass.myMethod();
	}
}
//-------------MyClass.class-----------------
class MyClass{
	public static void myMethod(){
		System.out.println("myMethod in MyClass");
	}
}
