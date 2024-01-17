package session7;

class DomesticBill extends ElectricityBill {
	public long billAmount(long units) {
		long totalAmount = 0;
		if (units <= 100) {
			totalAmount = units * 1;
		} else if (units > 100 && units <= 200) {
			totalAmount = (units - 100) * 5 / 2 + (100 * 1);
		} else if (units > 200 && units <= 500) {
			totalAmount = (units - 200) * 4 + (100 * 5 / 2) + (100 * 1);
		} else if (units > 500) {
			totalAmount = (units - 500) * 6 + (300 * 4) + (100 * 5 / 2) + (100 * 1);
		}
		return totalAmount;
	}

	@Override
	protected long billAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
