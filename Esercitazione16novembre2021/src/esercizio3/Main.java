package esercizio3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		OperaDArte o1= new Quadro("Gioconda", "Leonardo Da Vinci", 70, 50);
		OperaDArte o2= new Scultura("Il discobolo", "Partenope", 200, 80, 80);
		OperaDArte o3= new Quadro("L'urlo", "Munch", 80, 65);
		ArrayList<OperaDArte> opere= new ArrayList<OperaDArte>();
		opere.add(o3);
		opere.add(o2);
		CollezioneDArte collezione= new CollezioneDArte("Collezione privata Messina", "Agugliano", opere);
		collezione.inserisciOpera(o1);
		System.out.println(collezione);
	}

}
