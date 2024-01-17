package session9;

public class Main {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		Circle cir = new Circle();

		float op1 = rec.printArea(5, 10);
		float op2 = tri.printArea(20, 4);
		float op3 = cir.printArea(3.14f, 7.0f);

		System.out.println("The Are of Rectangle is : " + op1 + " meter square");
		System.out.println("The Are of Triangle is : " + op2 + " meter square");
		System.out.println("The Are of Circle is : " + op3 + " meter square");
	}

}
