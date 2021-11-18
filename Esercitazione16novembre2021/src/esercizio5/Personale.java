package esercizio5;

public abstract class Personale {
	protected String nome, indirizzo;
	protected long numeroTelefono;
	public Personale(String nome, String indirizzo, long numeroTelefono) {
		this.nome=nome;
		this.indirizzo=indirizzo;
		this.numeroTelefono=numeroTelefono;
	}
	
	public abstract double calcolaPaga();
	
	public abstract String toString();
}
