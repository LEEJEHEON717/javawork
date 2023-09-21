package interfaceex;

public class Car {
	//필드 - 인터페이스형 타입 변수 선언
    Tire frontLeftTire;
    Tire frontRightTire;
    Tire BackLeftTire;
    Tire BackRightTire;
	
	public Car() {
		frontLeftTire = new HanTire();
	    frontRightTire = new HanTire();
	    BackLeftTire = new KumTire();
	    BackRightTire = new KumTire();
	}
    
    //메서드
    void run() {
    	frontLeftTire.roll();
    	frontRightTire.roll();
    	BackLeftTire.roll();
    	BackRightTire.roll();
    }
	

}
