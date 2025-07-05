package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day4 {
	@BeforeMethod
	public void webloginHome() {
		System.out.println("before Method will get executed before all the class web Login Home DAY4");
	}

	
	@Test
	public void mobileLoginHome() {
		System.out.println("mobile Login Home DAY4");
		
	}
	
	@AfterMethod
	public void LoginAPIHome() {
		System.out.println("After Method will executed after all class Login api Home DAY4");
	}

}
