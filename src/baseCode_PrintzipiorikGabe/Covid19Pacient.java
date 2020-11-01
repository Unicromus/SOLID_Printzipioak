package baseCode_PrintzipiorikGabe;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient{

	public Covid19Pacient(String name, int years, Map<CardioVascularSymptom, Integer> cardios,
			Map<NeuroMuscularSymptom, Integer> neuros, Map<RespiratorySymptom, Integer> respirs) {
		super(name, years);
		this.cardios = cardios;
		this.neuros = neuros;
		this.respirs = respirs;
	}

	Map<CardioVascularSymptom,Integer> cardios=new HashMap<CardioVascularSymptom,Integer>();
	Map<NeuroMuscularSymptom,Integer> neuros=new HashMap<NeuroMuscularSymptom,Integer>();
	Map<RespiratorySymptom,Integer> respirs=new HashMap<RespiratorySymptom,Integer>();

	public void addCardioSymptom(CardioVascularSymptom c, Integer i){
		cardios.put(c, i);
	}
	public void addNeuroMuscularSymptom(NeuroMuscularSymptom nm, Integer i){
		neuros.put(nm, i);
	}
	public void addRespiratorySymptom (RespiratorySymptom r, Integer i){
		respirs.put(r, i);
	}
	double calcCovid19Impact() {
		double afection=0;
		double increment=0;
		double impact;

		//calculate affection
		for (CardioVascularSymptom c:cardios.keySet())
			afection=afection+c.getSeverityIndex()*cardios.get(c);
		for (NeuroMuscularSymptom c:neuros.keySet())
			afection=afection+c.getSeverityIndex()*cardios.get(c);
		for (RespiratorySymptom c:respirs.keySet())
			afection=afection+c.getSeverityIndex()*cardios.get(c);
		afection=afection/(cardios.size()+neuros.size()+respirs.size());

		//calculate increment
		if (getYears()>65) increment=afection*0.5;

		//calculate impact
		impact=afection+increment;

		return impact;
	}
}
