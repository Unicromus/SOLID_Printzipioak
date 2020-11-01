package liskovPrintzipioa_LSK;

public class Covid19Affection {

	double calcCovid19Affection(Covid19Pacient pacient) {
		double affection = 0;
		int elems = 0;

		//calculate affection
		for (Symptom s:pacient.symptoms.keySet()) {
			if (s.getCovidImpact()>50) {
				affection = affection + s.getSeverityIndex() * pacient.symptoms.get(s);
				elems++;
			}
		}
		if (elems != 0)
			affection = affection / elems;

		return affection;
	}

}
