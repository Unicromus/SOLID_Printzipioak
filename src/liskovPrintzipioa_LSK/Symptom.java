package liskovPrintzipioa_LSK;

public abstract class Symptom {

	public String name;
	int covidImpact;
	int severityIndex;
	int affectedDays;

	public Symptom(String name, int covidImpact, int severityIndex, int affectedDays) {
		this.name = name;
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
		this.affectedDays = affectedDays;
	}

	public void show(){
		System.out.println("symptom value:" + name + " severityIndex:" +
				severityIndex + " covidImpact:" + covidImpact);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

	public int getAffectedDays() {
		return affectedDays;
	}
	public void setAffectedDays(int affectedDays) {
		this.affectedDays = affectedDays;
	}

}
