package esercizio5;

public class Giornaliero extends Dipendente{
	private static double baseRetribuzione=40;
	private double giorniLavorativi;
	public Giornaliero(String nome, String indirizzo, long numeroTelefono, int giorniLavorativi) {
		super(nome, indirizzo, numeroTelefono);
		this.giorniLavorativi=giorniLavorativi;
	}
	
	public void setGiorniLavorativi(double giorni) {
		this.giorniLavorativi=giorni;
	}
	
	public double calcolaPaga() {
		return baseRetribuzione*this.giorniLavorativi;
	}

}
