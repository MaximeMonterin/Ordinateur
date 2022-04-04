package project;

public class Processeur extends Composants{
	private int nbCoeur;
	private int nbThreads;
	private double frequenceCPU;
	private String plateforme;
	private String typeProcesseur;
	private String famille;
	
	public Processeur(int nbCoeur, int nbThreads, double frequenceCPU, String plateforme,
			String typeProcesseur, String famille) {
		super();
		this.nbCoeur = nbCoeur;
		this.nbThreads = nbThreads;
		this.frequenceCPU = frequenceCPU;
		this.plateforme = plateforme;
		this.typeProcesseur = typeProcesseur;
		this.famille = famille;
	}

	public int getNbCoeur() {
		return nbCoeur;
	}

	public void setNbCoeur(int nbCoeur) {
		this.nbCoeur = nbCoeur;
	}

	public int getNbThreads() {
		return nbThreads;
	}

	public void setNbThreads(int nbThreads) {
		this.nbThreads = nbThreads;
	}

	public double getFrequenceCPU() {
		return frequenceCPU;
	}

	public void setFrequenceCPU(double frequenceCPU) {
		this.frequenceCPU = frequenceCPU;
	}

	public String getPlateforme() {
		return plateforme;
	}

	public void setPlateforme(String plateforme) {
		this.plateforme = plateforme;
	}

	public String getTypeProcesseur() {
		return typeProcesseur;
	}

	public void setTypeProcesseur(String typeProcesseur) {
		this.typeProcesseur = typeProcesseur;
	}

	public String getFamille() {
		return famille;
	}

	public void setFamille(String famille) {
		this.famille = famille;
	}

	@Override
	public String toString() {
		return "Processeur [nbCoeur=" + this.getNbCoeur() + ", nbThreads=" + this.getNbThreads() + ", frequenceCPU=" + this.getFrequenceCPU()
				+ ", plateforme=" + this.getPlateforme() + ", typeProcesseur=" + this.getTypeProcesseur() + ", famille=" + this.getFamille() + "]";
	}
	
	
	
	
	
}
