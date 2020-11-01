package dependentziInbertsioarenPrintzipioa_DIP;

public class Main {

	public static void main(String[] args) {

		// pacients
		Covid19Pacient pacient01 = new Covid19Pacient("David", 21);

		// symptoms
		pacient01.addSymptom(new CardioVascularSymptom("Cardio",10,5,7), 1);
		pacient01.addSymptom(new NeuroMuscularSymptom("Neuro",20,3,4), 1);
		pacient01.addSymptom(new RespiratorySymptom("Respiratory",60,1,14), 1);

		// strategies
		ICovid19Affection covid19AffectionStrategy01 = new Covid19AffectionStrategy01();
		ICovid19Increment covid19IncrementStrategy01 = new Covid19IncrementStrategy01();

		// pacients information
		System.out.println("Pacient: " + pacient01.getName() + " \t Years: " + pacient01.getYears());

		System.out.println("Covid19Impact: " + pacient01.calcCovid19Impact(covid19AffectionStrategy01, covid19IncrementStrategy01));

		System.out.println("SanatedDays: " + pacient01.sanatedDays());

		pacient01.showSymptoms();

		pacient01.cure();

	}

}
