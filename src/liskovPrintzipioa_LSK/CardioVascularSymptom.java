package liskovPrintzipioa_LSK;

public class CardioVascularSymptom extends Symptom implements CurableSymptom{

	public CardioVascularSymptom(String name, int covidImpact, int severityIndex, int affectedDays) {
		super(name, covidImpact, severityIndex, affectedDays);
	}
	
	public void cure(){
		System.out.println("treatment applied to: " + name);
	}

}
