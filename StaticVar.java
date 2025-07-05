package staticvar;

public class StaticVar {
	String name;//instance variable
	String address;//these variables are tied up to object
	static String city="Bangalore";//all obj sharing same city (saving memory) //static variable
	//static variable belongs to class but not object. 
	static int i =0;
	
	
	StaticVar(String name, String address) {//local Variable comes in constructor
	this.name=name;
	this.address=address;
	i++;
	System.out.println(i);
	//this.city=city;
		
		
	}
	public void getAddress() {
		System.out.println(name+" "+address+" "+city);//ranjith hootagalli Mysore
		//return address;
	}
	
	public static void getCity() {//static method accepts only static variable
		System.out.println(city);
	}
	public static void main(String[] args) {
		StaticVar obj = new StaticVar("Ranjith","Hootagalli");
		StaticVar obj1= new StaticVar("Ram", "kodambakkam");
		obj.getAddress();
		obj1.getAddress();
		getCity();//independents of object as it is static variable
		StaticVar.getCity();//or you can use classname.staticvariablename
		StaticVar.i=4;
		//obj.address="xyz"; this will not print anything
		
		
		
	}

}
