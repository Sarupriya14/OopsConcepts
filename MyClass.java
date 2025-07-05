package inheritance;

public class MyClass {
	public static void main(String[] args) {
		ParentClass objpar = new ParentClass();
		objpar.haveDiabetics();
		objpar.bungalow();
		
		
		ChildClass objchd = new ChildClass();
		objchd.ownCar();
		objchd.haveDiabetics();
		objchd.bungalow();
		
		
	}

}
