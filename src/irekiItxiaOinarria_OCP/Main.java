package irekiItxiaOinarria_OCP;

public class Main {

	public static void main(String[] args) {

		Covid19Pacient pacient01 = new Covid19Pacient("David", 21);

		pacient01.addSymptom(new CardioVascularSymptom(10,5,7), 1);
		pacient01.addSymptom(new NeuroMuscularSymptom(20,3,4), 1);
		pacient01.addSymptom(new RespiratorySymptom(60,1,14), 1);

		System.out.println("Covid19Impact: " + pacient01.calcCovid19Impact());

		System.out.println("SanatedDays: " + pacient01.sanatedDays());

	}

}
