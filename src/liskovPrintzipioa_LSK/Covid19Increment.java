package liskovPrintzipioa_LSK;

public class Covid19Increment {

	double calcCovid19Increment(Covid19Pacient pacient, double affection) {
		double increment = 0;

		//calculate increment
		if (pacient.getYears()>65)
			increment = affection * 0.5;
		if (pacient.getYears() >= 45 && pacient.getYears() <= 65)
			increment = affection * 0.3;

		return increment;
	}

}
