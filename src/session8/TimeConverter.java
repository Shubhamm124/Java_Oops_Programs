package session8;

public class TimeConverter {
	int minValue;
	int secValue;

	public float hoursToMin(float hValue) {
		float value = hValue * 60.0f;
		return value;
	}

	public float minToHours(float minValue) {
		float value = minValue / 60.0f;
		return value;
	}

	public float hoursToSeconds(float hValue) {
		float value = hValue * 60.0f * 60.0f;
		return value;
	}

	public float secToHours(float secValue) {
		float value = secValue / (60.0f * 60.0f);
		return value;
	}

	public static void main(String[] args) {
		TimeConverter tconvert = new TimeConverter();
		float value1 = tconvert.hoursToMin(2.75f);
		float value2 = tconvert.minToHours(75);
		float value3 = tconvert.hoursToSeconds(3.5f);
		float value4 = tconvert.secToHours(10800);

		System.out.println("The 2.75 Hours = " + value1 + " min");
		System.out.println("The 75 Minutes = " + value2 + " hours");
		System.out.println("The 3.5 Hours = " + value3 + " sec");
		System.out.println("The 10800 Seconds = " + value4 + " hours");
	}

}

