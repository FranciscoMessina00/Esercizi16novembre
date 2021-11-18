package esercizio5;

public class Impiegato extends Dipendente{
	private static double baseRetribuzione=30;
	private int bonus;
	public Impiegato(String nome, String indirizzo, long numeroTelefono, int bonus) {
		super(nome, indirizzo, numeroTelefono);
		this.bonus=bonus;
	}
	
	public void setBonus(int bonus) {
		this.bonus+=bonus;
	}
	
	public double calcolaPaga() {
		return this.bonus*baseRetribuzione;
	}

}
