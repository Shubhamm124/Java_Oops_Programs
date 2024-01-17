package session9;

class Circle extends Shape {
	public float printArea(float pi, float radius) {
		float area = pi * radius * radius;
		return area;
	}

	@Override
	protected float printArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}

