package session10;

class AssistantProfessor extends Employee {
	public double calculateDa(double Bp) {
		double da = Bp * (97.00 / 100.00);
		return da;
	}

	public double calculateHra(double Bp) {
		double hra = Bp * (1.00 / 10.00);
		return hra;
	}

	public double calculatePf(double Bp) {
		double pf = Bp * (12.00 / 100.00);
		return pf;
	}

	public double calculateScf(double Bp) {
		double scf = Bp * (0.1 / 100);
		return scf;
	}

	public double calculateGrossSal(double Bp, double Da, double Hra) {
		double grossSal = Bp + Da + Hra;
		return grossSal;
	}

	public double calculateNettSal(double grossSal, double Pf, double Scf) {
		double nettSal = grossSal - Pf - Scf;
		return nettSal;
	}

	@Override
	public double calculateDa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateHra() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculatePf() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateScf() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateGrossSal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateNettSal() {
		// TODO Auto-generated method stub
		return 0;
	}
}
