package session3;

public class Car {
	static String carWheels = "4 Wheels";

	String carName;
	String carColor;
	String carPrice;

	public float calculateMileage(float distance, float fuel) {
		float Mileage = distance / fuel;
		return Mileage;
	}

	public int calculateSpeed(int distance, int time) {
		int speed = distance / time;
		return speed;
	}

	public static void main(String[] args) {
		// Create Objects of Car
		Car Maruti800 = new Car();
		Car Innova = new Car();
		Car HondaCity = new Car();

		// Calculate Mileage of Cars
		float mileage1 = Maruti800.calculateMileage(450, 25);
		float mileage2 = Innova.calculateMileage(100, 10);
		float mileage3 = HondaCity.calculateMileage(56, 4);

		// Display Mileage of Cars
		System.out.println("Mileage of Maruti800 is " + mileage1 + " KM/L");
		System.out.println("Mileage of Innova is " + mileage2 + " KM/L");
		System.out.println("Mileage of HondaCity is " + mileage3 + " KM/L");

		// Calculate Speed of Cars
		float speed1 = Maruti800.calculateSpeed(400, 5);
		float speed2 = Innova.calculateSpeed(120, 3);
		float speed3 = HondaCity.calculateSpeed(240, 4);

		// Display Mileage of Cars
		System.out.println("Speed of Maruti800 is " + speed1 + " KM/H");
		System.out.println("Speed of Innova is " + speed2 + " KM/H");
		System.out.println("Speed of HondaCity is " + speed3 + " KM/H");

//		System.out.println("No of wheels for Maruti800 is : " + Car.carWheels);
//		System.out.println("No of wheels for Innova is : " + Car.carWheels);
//		System.out.println("No of wheels for HondaCity is : " + Car.carWheels);
		
		System.out.println(carWheels);
		System.out.println(carWheels);
		System.out.println(carWheels);
	}
}
