package project;

public class Composants {
	private String name;
	private String marque;
	private int capacite;
	private String stockage;
	
	public Composants(String name, String marque) {
		this.name = name;
		this.marque = marque;
	}
	
	public Composants(int capacite, String stockage) {
		this.capacite = capacite;
		this.stockage = stockage;
	}
	
	public Composants(String stockage) {
		this.stockage = stockage;
	}
	
	public Composants(String name, String marque, int capacite, String stockage) {
		this.name = name;
		this.marque = marque;
		this.capacite = capacite;
		this.stockage = stockage;
	}
	
	public Composants() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public String getStockage() {
		return stockage;
	}

	public void setStockage(String stockage) {
		this.stockage = stockage;
	}

	@Override
	public String toString() {
		return "Composants [name=" + this.getName() + ", marque=" + this.getMarque() + ", capacite=" + this.getCapacite() + ", stockage=" + this.getStockage()
				+ "]";
	}
	
	
	
}
