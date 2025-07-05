package constructorpackage;

public class ConstructDemo {
	public ConstructDemo() { //default constructor
		System.out.println("i am the constructor");//this will be displayed in the output.
		//even though it is not called.
		System.out.println("i am also the constructor");
		
	}
	public ConstructDemo(int a, int b)
	{
		System.out.println("I am parameterized constructor");
		int c=a+b;
		System.out.println(c);
	}
	
//	public ConstructDemo(String str) {
//		System.out.println(str);
//	}
	public void getDat() {
		System.out.println("i am the method");
	}
	public static void main(String[] args) {
		//ConstructDemo cd = new ConstructDemo("hello");
		ConstructDemo c = new ConstructDemo(2,3);//if there is an args passed, it will execute parameterized
		//if no args, it will execute default constructor only
		//cd.getDat();//method should be called
	}

}
