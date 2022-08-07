package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 0;
	long chassisNumber = -112233445566778L;
	boolean isPunctured = false;
	String bikeName = "TvsApache";
	double runningKM = 23.6666;
	
public static void main(String[] args) {
		
		TwoWheeler obj = new TwoWheeler();
		System.out.println ("No. Of Wheels"+ " = " + obj.noOfWheels);
		System.out.println ("No. Of Mirrors"+ " = " + obj.noOfMirrors);
		System.out.println ("chassisNumber"+ " = " + obj.chassisNumber);
		System.out.println ("Is TwoWheeler Punctured"+ " = " + obj.isPunctured);
		System.out.println ("Bike Name"+ " = " + obj.bikeName);
		System.out.println ("Running KM"+ " = " + obj.runningKM);
		
}

}
