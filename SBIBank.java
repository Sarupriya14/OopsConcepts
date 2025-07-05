package polyOverRide;

public class SBIBank extends RBIbank{
	public void fdRate() {
		System.out.println("fd-6.2%");
	}
	public static void main(String[] args) {
		SBIBank sbiobj = new SBIBank();
		sbiobj.fdRate();
		
		RBIbank rbobj= new RBIbank();
		rbobj.fdRate();//driver.quit() method is over ridden example
	}

}
