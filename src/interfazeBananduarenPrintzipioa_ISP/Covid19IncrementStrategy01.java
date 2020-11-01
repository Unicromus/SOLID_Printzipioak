package interfazeBananduarenPrintzipioa_ISP;

public class Covid19IncrementStrategy01 implements ICovid19Increment {

	public double calcCovid19Increment(IYearAble years, double affection) {
		double increment = 0;

		//calculate increment
		if (years.getYears()>65)
			increment = affection * 0.5;
		if (years.getYears() >= 45 && years.getYears() <= 65)
			increment = affection * 0.3;

		return increment;
	}

}
