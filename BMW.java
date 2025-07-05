package polyOverRide;

import org.openqa.selenium.chrome.ChromeDriver;

public class BMW extends Car{
	
	public BMW() {//No argument Constructor
		
	}
	public BMW(String name) { 
		super();
		
	}
	public BMW(int num) {
		this("BMW");//this method should be the 1st line of the constructor,
		//for calling another constructor
		//this method can be used inside constructor 
		
	}
	
	public BMW(int num,int num2) {//constructor overloading
		
	}
	public void autoPark() {
		System.out.println("autopark BMW");
		//ChromeDriver- Constructor overloading example
	}
	public void applyBreak() {//we have the same method in Vehicle Class
		System.out.println("Apply ABS Break"); //this is overridden method
	}
	public void getBrakes() {//getBreak method to call super class method,
		//this class method.
		this.applyBreak();//applyABS break //overridden Method will be shown
		super.applyBreak();//apply normal break//Not overridden method from super 
		//class method
	}

}
