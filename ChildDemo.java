package superpackage;

public class ChildDemo extends ParentDemo {
	String name = "QAClick";
	
	public ChildDemo() {
		super();//this should be always be at 1st line in child constructor
		System.out.println("I am child constructor");
	}
	public void getStringData() {
		System.out.println(name);//global var of child class
		System.out.println(super.name);//global var of parent class
		
	}
	public void getData() {
		super.getData();//this will print parent class method
		System.out.println("I am child class");
	}

	public static void main(String[] args) {
		ChildDemo cdemo = new ChildDemo();
		cdemo.getStringData();
		cdemo.getData();//both parent and child will get printed
		
	}
}
