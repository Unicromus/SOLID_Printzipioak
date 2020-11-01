package liskovPrintzipioa_LSK;

public class NeuroMuscularSymptom extends Symptom implements IncurableSymptom{

	public NeuroMuscularSymptom(String name, int covidImpact, int severityIndex, int affectedDays) {
		super(name, covidImpact, severityIndex, affectedDays);
	}

}
