package interfaceex;

public class CarMain {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.run();
		
		//앞바퀴 교체(변경)
		Tire kum1 = new KumTire();
		Tire kum2 = new KumTire();
		
		myCar.frontLeftTire = kum1;
		myCar.BackRightTire = kum2;
		
		//myCar.frontLeftTire = new KumTire();
		//myCar.BackRightTire = new KumTire();
		
		myCar.run();
		
		System.out.println("==============================");
		
		Car2 myCar2 = new Car2();
		//앞바퀴 교체(변경)
		myCar2.tires[0] = new KumTire();
		myCar2.tires[1] = new KumTire();
		myCar2.run();		
	}
}
