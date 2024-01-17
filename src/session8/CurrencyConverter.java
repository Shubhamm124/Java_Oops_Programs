package session8;

public class CurrencyConverter {
	double dollarValue = 83.19;
	double euroValue = 91.16;
	double yenValue = 0.58;

	public float dollarToInr(float dvalue) {
		float value = dvalue * 83.19f;
		return value;
	}

	public float inrToDollar(float inrValue) {
		float value = inrValue / 83.19f;
		return value;
	}

	public float euroToInr(float evalue) {
		float value = evalue * 91.16f;
		return value;
	}

	public float inrToEuro(float inrValue) {
		float value = inrValue / 91.16f;
		return value;
	}

	public float yenToInr(float yvalue) {
		float value = yvalue * (58.0f / 100.0f);
		return value;
	}

	public float inrToYen(float inrValue) {
		float value = inrValue / 0.58f;
		return value;
	}

	public static void main(String[] args) {
		CurrencyConverter cconvert = new CurrencyConverter();
		float value1 = cconvert.dollarToInr(72);
		float value2 = cconvert.inrToDollar(176);
		float value3 = cconvert.euroToInr(45);
		float value4 = cconvert.inrToEuro(789);
		float value5 = cconvert.yenToInr(5000);
		float value6 = cconvert.inrToYen(176);

		System.out.println("The value of 72$ is : " + value1 + " rs.");
		System.out.println("The value of 176 Rs is : " + value2 + " $.");
		System.out.println("The value of 45€ is : " + value3 + " rs.");
		System.out.println("The value of 789 Rs is : " + value4 + " €.");
		System.out.println("The value of 5000¥ is : " + value5 + " rs.");
		System.out.println("The value of 176 Rs is : " + value6 + " ¥.");

	}

}
