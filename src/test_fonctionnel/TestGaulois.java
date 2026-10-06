package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;


public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);
		Druide panoramix = new Druide("Panoramix", 2);

		
		asterix.parler("Bonjour Obélix");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
		
		
		Romain minus = new Romain("Minus", 6);
		Romain brutus = new Romain("Brutus", 14);

		
		System.out.println("Dans la forêt " + asterix.getNom() + " et " + obelix.getNom() + " tombent nez à nez sur le romain " + brutus.getNom());
		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);

		for (int i=3; i>0; i--) {
			asterix.frapper(brutus);
		}
	}
}
