package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@AfterSuite
	public void ploan() {
		System.out.println("After suite executes end of the suite personal loan Day2");
	}
	
	@BeforeTest
	public void prerquistes() {
		System.out.println("Before Test will get executed initially - suite level DAY2");
	}

}
