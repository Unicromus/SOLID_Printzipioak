package irekiItxiaOinarria_OCP;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient{

	Map<Symptom,Integer> symptoms = new HashMap<Symptom,Integer>();

	public Covid19Pacient(String name, int years) {
		super(name, years);
	}

	public void addSymptom(Symptom s, Integer w) {
		symptoms.put(s,w);
	}

	public int sanatedDays() {
		int maxAffectedDays = 0;
		int affectedDays = 0;
		for (Symptom s:symptoms.keySet()) {
			affectedDays = s.getAffectedDays();
			if (affectedDays > maxAffectedDays)
				maxAffectedDays = affectedDays;
		}
		return maxAffectedDays;
	}

	double calcCovid19Impact() {
		double affection = 0;
		double increment = 0;
		double impact = 0;

		//calculate affection
		for (Symptom s:symptoms.keySet())
			affection = affection + s.getSeverityIndex() * symptoms.get(s);
		affection = affection / (symptoms.size());

		//calculate increment
		if (getYears()>65)
			increment = affection * 0.5;

		//calculate impact
		impact = affection + increment;

		return impact;
	}
}
