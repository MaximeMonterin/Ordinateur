package project;

import java.util.List;

public class Ordinateur {
	private String designation;
	private String marque;
	private String modele;
	private String sysExploit;
	private List<Composants> composants;
	private CaracteristiquesPhysiques carac;
	
	public Ordinateur(String designation, String marque, String modele, String sysExploit, List<Composants> composants,
			CaracteristiquesPhysiques carac) {
		this.designation = designation;
		this.marque = marque;
		this.modele = modele;
		this.sysExploit = sysExploit;
		this.composants = composants;
		this.carac = carac;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getSysExploit() {
		return sysExploit;
	}
	public void setSysExploit(String sysExploit) {
		this.sysExploit = sysExploit;
	}
	public List<Composants> getComposants() {
		return composants;
	}
	public void setComposants(List<Composants> composants) {
		this.composants = composants;
	}
	public CaracteristiquesPhysiques getCarac() {
		return carac;
	}
	public void setCarac(CaracteristiquesPhysiques carac) {
		this.carac = carac;
	}

	@Override
	public String toString() {
		return "Ordinateur [designation=" + this.getDesignation() + ", marque=" + this.getMarque() + ", modele=" + this.getModele() + ", sysExploit="
				+ this.getSysExploit() + ", composants=" + this.getComposants().toString() + ", carac=" + this.getCarac().toString() + "]";
	}
	
	
	
	
}
