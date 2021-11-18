package esercizio1;

public class QuaCubo {

	public static void main(String[] args) {
		Ritorno r1= new Numero(10);
		System.out.println(r1.getRitorno());		
		Ritorno r2= new Quadrato(10);
		System.out.println(r2.getRitorno());
		Ritorno r3= new Cubo(10);
		System.out.println(r3.getRitorno());
	}

}
