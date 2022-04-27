package Interface;

interface Vehicle {
	default void Message() {
		System.out.println("Inside Vehicle.");
	}
}

interface FourWheeler {
	default void Message() {
		System.out.println("Inside FourWheeler.");
	}
}
class Car implements Vehicle, FourWheeler {

	@Override
	public void Message() {
		// TODO Auto-generated method stub
		Vehicle.super.Message();
	}
	
}

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.Message();
	}

}