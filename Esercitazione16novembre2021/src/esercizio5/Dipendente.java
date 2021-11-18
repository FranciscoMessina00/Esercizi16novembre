package esercizio5;

public abstract class Dipendente extends Personale{

	public Dipendente(String nome, String indirizzo, long numeroTelefono) {
		super(nome, indirizzo, numeroTelefono);
	}

	public abstract double calcolaPaga();

	public String toString() {
		return "\nNome del dipendente: "+this.nome+
				"\nIndirizzo: "+this.indirizzo+
				"\nNumero di telefono: "+this.numeroTelefono+
				"\nPaga: "+calcolaPaga()+"€\n";
	}

}
