package liskovPrintzipioa_LSK;

public class Main {

	public static void main(String[] args) {

		Covid19Pacient pacient01 = new Covid19Pacient("David", 21);

		pacient01.addSymptom(new CardioVascularSymptom("Cardio",10,5,7), 1);
		pacient01.addSymptom(new NeuroMuscularSymptom("Neuro",20,3,4), 1);
		pacient01.addSymptom(new RespiratorySymptom("Respiratory",60,1,14), 1);

		System.out.println("Covid19Impact: " + pacient01.calcCovid19Impact());

		System.out.println("SanatedDays: " + pacient01.sanatedDays());
		
		pacient01.showSymptoms();
		
		pacient01.cure();

	}

}
