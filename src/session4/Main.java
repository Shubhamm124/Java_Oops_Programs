package session4;

class Main {

	public static void main(String[] args) {
//		Car c = new Car();
		Tata nano = new Tata();
		int val1 = nano.accelerate();
		System.out.println(val1);
//		nano.value = 6;
		nano.checkFitting();
		nano.joinPart();
		nano.getWheels();
		Maruti maruti800 = new Maruti();
		int val2 = maruti800.accelerate();
		System.out.println(val2);
		maruti800.checkFitting();
		maruti800.joinPart();
		maruti800.getWheels();
	}
}