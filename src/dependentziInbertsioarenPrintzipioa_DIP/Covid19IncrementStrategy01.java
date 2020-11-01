package dependentziInbertsioarenPrintzipioa_DIP;

public class Covid19IncrementStrategy01 implements ICovid19Increment{

	public double calcCovid19Increment(Covid19Pacient pacient, double affection) {
		double increment = 0;

		//calculate increment
		if (pacient.getYears()>65)
			increment = affection * 0.5;
		if (pacient.getYears() >= 45 && pacient.getYears() <= 65)
			increment = affection * 0.3;

		return increment;
	}

}
