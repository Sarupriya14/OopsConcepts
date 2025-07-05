package inheritancePackage;

public class ReusableMethods extends ReusableUtility {
	int a;//class variable
	public ReusableMethods(int a) {//instance variable //3
		super(a);//parent class constructor is invoked. 
		this.a=a;
	
		// TODO Auto-generated constructor stub
	}

	public int increment() {
		a=a+1;
		return a;
		
	}
	
	public int decrement() {
		a=a-1;
		return a;
		
	}
	
	

}
