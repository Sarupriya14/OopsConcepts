package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@Parameters({"URL"})
	@Test
	public void webloginCar(String urlname) {
		System.out.println("web Login DAY3");
		System.out.println(urlname);
	}

	
	@Test(groups= {"smoke"})
	public void LoginCar() {
		System.out.println("smoke");
		
	}
	
	@Test(enabled=false)
	public void LoginAPICar() {
		System.out.println("Login api DAY3");
	}
	
	@Test(groups= {"smoke"})
	public void SignIn() {
		System.out.println("smoke");
	}
	
	@Test(dependsOnMethods = {"Login","mobilewebloginCar"})
	public void mobileSignout() {
		System.out.println("Mobile Sign out DAY3");
		
	}

	
	@Test
	public void Login() {
		System.out.println("Normal Login DAY3");
	}
}
