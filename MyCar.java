package polyOverRide;

public class MyCar {
	public static void main(String[] args) {
		Vehicle vehObj = new Vehicle();
		Car carobj= new Car();
		BMW bobj = new BMW();
		bobj.getBrakes();//this.applybreak,super.applybreak();
		
//         vehObj.applyBreak();
//         vehObj.soundHorn();
////		
//
//         carobj.applyBreak();
//		 carobj.soundHorn();
//         carobj.turnAc();
//	     carobj.handBreak();
////	  	
//
////		
//        bobj.applyBreak();
//
//        bobj.soundHorn();
//        bobj.turnAc();
//		bobj.handBreak();
//		bobj.autoPark();
////		
	}

}
