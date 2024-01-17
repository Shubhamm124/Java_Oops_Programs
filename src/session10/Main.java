package session10;

public class Main {

	public static void main(String[] args) {
		Programmer pgr = new Programmer();
		AssistantProfessor assisprof = new AssistantProfessor();
		AssociateProfessor assosiprof = new AssociateProfessor();
		Professor prof = new Professor();

		double val1 = pgr.calculateDa(10000);
		double val2 = pgr.calculateHra(10000);
		double val3 = pgr.calculatePf(10000);
		double val4 = pgr.calculateScf(10000);
		double val5 = pgr.calculateGrossSal(10000, val1, val2);
		double val6 = pgr.calculateNettSal(val5, val3, val4);

		System.out.println("DA of Programmer is : " + val1 + " rs");
		System.out.println("Hra of Programmer is : " + val2 + " rs");
		System.out.println("Pf of Programmer is : " + val3 + " rs");
		System.out.println("Scf of Programmer is : " + val4 + " rs");
		System.out.println("Gross Salary of Programmer is : " + val5 + " rs");
		System.out.println("Nett Salary of Programmer is : " + val6 + " rs");

		System.out.println();
		System.out.println();

		double val7 = assisprof.calculateDa(20000);
		double val8 = assisprof.calculateHra(20000);
		double val9 = assisprof.calculatePf(20000);
		double val10 = assisprof.calculateScf(20000);
		double val11 = assisprof.calculateGrossSal(20000, val7, val8);
		double val12 = assisprof.calculateNettSal(val11, val9, val10);

		System.out.println("DA of AssistantProfessor is : " + val7 + " rs");
		System.out.println("Hra of AssistantProfessor is : " + val8 + " rs");
		System.out.println("Pf of AssistantProfessor is : " + val9 + " rs");
		System.out.println("Scf of AssistantProfessor is : " + val10 + " rs");
		System.out.println("Gross Salary of AssistantProfessor is : " + val11 + " rs");
		System.out.println("Nett Salary of AssistantProfessor is : " + val12 + " rs");

		System.out.println();
		System.out.println();

		double val13 = assosiprof.calculateDa(25000);
		double val14 = assosiprof.calculateHra(25000);
		double val15 = assosiprof.calculatePf(25000);
		double val16 = assosiprof.calculateScf(25000);
		double val17 = assosiprof.calculateGrossSal(25000, val13, val14);
		double val18 = assosiprof.calculateNettSal(val17, val15, val16);

		System.out.println("DA of AssociateProfessor is : " + val13 + " rs");
		System.out.println("Hra of AssociateProfessor is : " + val14 + " rs");
		System.out.println("Pf of AssociateProfessor is : " + val15 + " rs");
		System.out.println("Scf of AssociateProfessor is : " + val16 + " rs");
		System.out.println("Gross Salary of AssociateProfessor is : " + val17 + " rs");
		System.out.println("Nett Salary of AssociateProfessor is : " + val18 + " rs");

		System.out.println();
		System.out.println();

		double val19 = prof.calculateDa(32000);
		double val20 = prof.calculateHra(32000);
		double val21 = prof.calculatePf(32000);
		double val22 = prof.calculateScf(32000);
		double val23 = prof.calculateGrossSal(32000, val19, val20);
		double val24 = prof.calculateNettSal(val23, val21, val22);

		System.out.println("DA of Professor is : " + val19 + " rs");
		System.out.println("Hra of Professor is : " + val20 + " rs");
		System.out.println("Pf of Professor is : " + val21 + " rs");
		System.out.println("Scf of Professor is : " + val22 + " rs");
		System.out.println("Gross Salary of Professor is : " + val23 + " rs");
		System.out.println("Nett Salary of Professor is : " + val24 + " rs");
	}

}
