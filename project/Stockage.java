package project;

public class Stockage extends Composants{
	private String type;

	public Stockage(int capacite, String stockage, String type) {
		super(capacite, stockage);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Stockage [type=" + this.getType() + "]";
	}
	
	
	
	
	
	
}
