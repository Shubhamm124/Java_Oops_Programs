package session8;

public class DistanceConverter {

	long kmValue;
	long milesValue;

	public float meterToKm(float meterValue) {
		float value = meterValue / 1000.0f;
		return value;
	}

	public float kmToMeter(float kmValue) {
		float value = kmValue * 1000.0f;
		return value;
	}

	public float milesToKm(float milesValue) {
		float value = milesValue * 1.60934f;
		return value;
	}

	public float kmToMiles(float kmValue) {
		float value = kmValue / 1.60934f;
		return value;
	}

	public static void main(String[] args) {
		DistanceConverter myobj = new DistanceConverter();
		float op1 = myobj.meterToKm(1500);
		float op2 = myobj.kmToMeter(38.5f);
		float op3 = myobj.milesToKm(12);
		float op4 = myobj.kmToMiles(61);

		System.out.println("The 1500 Meters = " + op1 + " km");
		System.out.println("The 38.5 Kilometers = " + op2 + " m");
		System.out.println("The 12 Miles = " + op3 + " km");
		System.out.println("The 61 Kilometers = " + op4 + " mi");
	}

}

