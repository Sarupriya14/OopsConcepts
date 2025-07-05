package superpackage;

public class ThisDemo {
	
	int a = 2;//global var
	
	public void getData() {
		int a = 3; //local variable
		int b=a+this.a;
		System.out.println("this demo class:"+a);
		System.out.println(this.a);//this refers to class level obj
		System.out.println(b);
	}
	public static void main(String[] args) {
		ThisDemo tobj = new ThisDemo();
		tobj.getData();
		
	}

}
