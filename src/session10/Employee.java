package session10;

abstract public class Employee {
	String emplName;
	long emplId;
	String emplAddr;
	String emplMobNo;
	double emplBp;
	double emplDa;
	double emplHra;
	double emplPf;
	double emplScf;

	abstract public double calculateDa();

	abstract public double calculateHra();

	abstract public double calculatePf();

	abstract public double calculateScf();

	abstract public double calculateGrossSal();

	abstract public double calculateNettSal();
}
