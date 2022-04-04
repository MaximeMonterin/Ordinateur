package project;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Processeur processeur = new Processeur(16, 24, 3.6, "Intel Alder lake-S", "Intel Core i9-12900K", "Intel Core i9");
		Memoire memoire = new Memoire(64, "DDR5", 4400, "Go");
		
		Stockage stockage1 = new Stockage(2, "To", "SSD");
		Stockage stockage2 = new Stockage(3, "To", "HDD");
		
		Affichage RTX3090 = new Affichage("GeForce RTX", "NVIDIA", 24, "Go");
		
		List<Composants> composants = new ArrayList<>();
		composants.add(processeur);
		composants.add(memoire);
		composants.add(stockage1);
		composants.add(stockage2);
		composants.add(RTX3090);
		
		CaracteristiquesPhysiques caracPhys = new CaracteristiquesPhysiques("Tour", "Moyen Tour", 239.9, 511.3, 551.6, 15.6, 850);
		Ordinateur MSIMEGAegis = new Ordinateur("Designation MSI MEG Aegis Ti5 12VTJ-001EU", "MSI", "9S6-B93911-001", "Windows 11 Pro 64 Bits", composants, caracPhys);
		
		System.out.println(MSIMEGAegis.toString());

	}

}
