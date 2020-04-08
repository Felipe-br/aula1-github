package Entities;

public class Aluno {
	
	public String name;
	public double priTrimestre;
	public double segTrimestre;
	public double terTrimestre;
	
	public double somaNota() {
		return priTrimestre + segTrimestre + terTrimestre;
	}
	
	public double missingPoints() {
		if (somaNota() < 60.0) {
			return 60.0 - somaNota();
			
		}
		else {
			return 0.0;
		}
	}

}
