package baseCode_PrintzipiorikGabe;

public class CardioVascularSymptom {

	int covidImpact;
	int severityIndex;

	public CardioVascularSymptom(int covidImpact, int severityIndex) {
		super();
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
	}

	public int getCovidImpact() {
		return covidImpact;
	}

	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}

	public int getSeverityIndex() {
		return severityIndex;
	}

	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}

}
