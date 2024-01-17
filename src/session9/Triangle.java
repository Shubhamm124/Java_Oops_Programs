package session9;

class Triangle extends Shape {
	public int printArea(int height, int base) {
		int area = (height * base) / 2;
		return area;
	}

	@Override
	protected float printArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
