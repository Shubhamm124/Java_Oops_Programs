package session4;

abstract public class Car {
	final int noOfWheels = 4;
	private String color;
	String make;
	String model;
	int speed;

	public void setColor() {
		this.color = color;
	}

	abstract int accelerate();

}