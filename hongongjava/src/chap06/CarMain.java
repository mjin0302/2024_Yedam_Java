package chap06;

public class CarMain {

	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();
		
		// 필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		// 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
		myCar.color = "흰색";
		System.out.println("수정된 색: " + myCar.color);
		
		// 교재 p279
		// gas체크하기
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("붕붕 출발~");
			myCar.run();
		}
		if(myCar.isLeftGas()) {
			System.out.println("gas 충분");
		} else {
			System.out.println("gas 부족");
		}
		
		// p284
		myCar.keyTurnOn();
		myCar.run2();
		
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
		

	}

}