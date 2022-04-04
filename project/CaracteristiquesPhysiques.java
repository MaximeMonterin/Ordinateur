package project;

public class CaracteristiquesPhysiques {
	private String formatPC;
	private String formatBoitier;
	private double largeur;
	private double hauteur;
	private double profondeur;
	private double poids;
	private int puissance;
	
	public CaracteristiquesPhysiques(String formatPC, String formatBoitier, double largeur, double hauteur,
			double profondeur, double poids, int puissance) {
		this.formatPC = formatPC;
		this.formatBoitier = formatBoitier;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.profondeur = profondeur;
		this.poids = poids;
		this.puissance = puissance;
	}

	public String getFormatPC() {
		return formatPC;
	}

	public void setFormatPC(String formatPC) {
		this.formatPC = formatPC;
	}

	public String getFormatBoitier() {
		return formatBoitier;
	}

	public void setFormatBoitier(String formatBoitier) {
		this.formatBoitier = formatBoitier;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public double getProfondeur() {
		return profondeur;
	}

	public void setProfondeur(double profondeur) {
		this.profondeur = profondeur;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	@Override
	public String toString() {
		return "CaracteristiquesPhysiques [formatPC=" + this.getFormatPC() + ", formatBoitier=" + this.getFormatBoitier() + ", largeur="
				+ this.getLargeur() + ", hauteur=" + this.getHauteur() + ", profondeur=" + this.getProfondeur() + ", poids=" + this.getPoids() + ", puissance="
				+ this.getPuissance() + "]";
	}
	
	
	
}
