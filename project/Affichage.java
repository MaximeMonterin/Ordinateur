package project;

public class Affichage extends Composants{
	public Affichage(String name, String marque, int capacite, String stockage) {
		super(name, marque, capacite, stockage);
	}

	@Override
	public String toString() {
		return "Affichage [tailleMemoire=" + this.getName() + ", name=" + this.getMarque() + ", marque=" + this.getCapacite() + "]";
	}
}
