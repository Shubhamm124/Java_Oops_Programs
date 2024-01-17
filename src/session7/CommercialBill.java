package session7;

class CommercialBill extends ElectricityBill {
	public long billAmount(long units) {
		long totalAmount = 0;
		if (units <= 100) {
			totalAmount = units * 2;
		} else if (units > 100 && units <= 200) {
			totalAmount = (units - 100) * 9 / 2 + (100 * 2);
		} else if (units > 200 && units <= 500) {
			totalAmount = (units - 200) * 6 + (100 * 9 / 2) + (100 * 2);
		} else if (units > 500) {
			totalAmount = (units - 500) * 7 + (300 * 6) + (100 * 9 / 2) + (100 * 2);
		}
		return totalAmount;
	}

	@Override
	protected long billAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
