package liskovPrintzipioa_LSK;

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

	public void showSymptoms(){
		for (Symptom s: symptoms.keySet())
			s.show();
	}
	public void cure(){
		for (Symptom s: symptoms.keySet())
			if (s instanceof CurableSymptom)
				((CurableSymptom) s).cure();
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
		Covid19Affection affe = new Covid19Affection();
		affection = affe.calcCovid19Affection(this);

		//calculate increment
		Covid19Increment incr = new Covid19Increment();
		increment = incr.calcCovid19Increment(this, affection);

		//calculate impact
		impact = affection + increment;
		if (getYears() < 10)
			impact = 0;

		return impact;
	}
}
