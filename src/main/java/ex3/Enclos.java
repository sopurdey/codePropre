package ex3;

import java.util.List;

public abstract class Enclos {
	private String nom;
	private String type;
	private List<Animal> animaux;

	public abstract void addAnimal(Animal animal);
	public abstract void calculerKgsNourritureParJour();

	public void afficherListeAnimaux() {
		for (Animal animal : animaux) {
			System.out.println(animal);
		}
	}
	
	public void compterAnimaux() {
		int total = 0;
		for (int i = 0; i < animaux.size(); i++) {
			total += i;
		}
		System.out.println("Nombre d'animaux : " + total);
	}
}
