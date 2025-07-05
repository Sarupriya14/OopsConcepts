package polyOverLoad;

public class Calculator {
	
public void add() {
	int a =9, b=10;
	System.out.println(a+b);
}
public void add(int a, int b) {
	int c =a+b;//method overloading
	System.out.println(c);
	
}
public int add(int a,int b,int c) { //method overloading
	return a+b+c;
}
public double add(double a,double b) { //happens inside class,same method name,different parameters
	return a+b;
}

public String name() {
	return "testleaf";
}

public String name(String f, String l) {
	return f+" "+l;
}

public static void main(String[] args) {
	Calculator obj = new Calculator();
	obj.add();
	double total = obj.add(19.2, 20.0);
	System.out.println(total);
	obj.add(14, 4);
	obj.add(1, 2, 3);
	String name = obj.name();
	System.out.println(name);
	String FLobje = obj.name("priya", "saru");
	System.out.println(FLobje);//println is a method, best example for method overloading
}
}
