package session7;

abstract class ElectricityBill {
	long consNo;
	String consName;
	protected long PrevReading;
	protected long currReading;
	String ebType;

	public long calculateUnitCnsume(long current, long previous) {
		long unitConsume = current - previous;
		return unitConsume;
	}

	protected abstract long billAmount();
}
