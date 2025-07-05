package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {
	@AfterTest
	public void lastExecution() {
		System.out.println("After test last execution in the test DAY1");
	}
	@BeforeSuite
	public void Demo()
	{
		System.out.println("before suite executes first in the suite Demo Day1");
	}
	
	@Test(groups= {"smoke"})
	public void secondDemo() {
		System.out.println("second demo Day1 ");
	}

}
