package polyOverRide;

public class Car extends Vehicle {
	public void handBreak() {
		System.out.println("applying hand break");
	}
	public void turnAc() {
		System.out.println("turning on AC");
	}
	public void sunroof() {
		Car carobj = new Car(); //since it is non-static method, and same class
		carobj.handBreak(); //No need of creating Object
	    this.turnAc();//we can call directly.
	    this.handBreak();//this keyword which is a representation of current class
	}

}
