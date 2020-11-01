package liskovPrintzipioa_LSK;

public class RespiratorySymptom extends Symptom implements CurableSymptom{

	public RespiratorySymptom(String name, int covidImpact, int severityIndex, int affectedDays) {
		super(name, covidImpact, severityIndex, affectedDays);
	}
	
	public void cure(){
		System.out.println("treatment applied to: " + name);
	}

}
