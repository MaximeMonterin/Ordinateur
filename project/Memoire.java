package project;

public class Memoire extends Composants{
	private int taille;
	private String type;
	private int frequence;
	
	public Memoire(int taille, String type, int frequence, String stockage) {
		super(stockage);
		this.taille = taille;
		this.type = type;
		this.frequence = frequence;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFrequence() {
		return frequence;
	}

	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}

	@Override
	public String toString() {
		return "Memoire [taille=" + this.getTaille() + ", type=" + this.getType() + ", frequence=" + this.getFrequence() + "]";
	}
	
	
	
	
}
