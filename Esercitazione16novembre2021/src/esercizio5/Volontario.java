package esercizio5;

public class Volontario extends Personale{

	public Volontario(String nome, String indirizzo, long numeroTelefono) {
		super(nome, indirizzo, numeroTelefono);
	}

	public double calcolaPaga() {
		return 0;
	}
	
	public String toString() {
		return 	"\nNome del volontario: "+this.nome+
				"\nIndirizzo: "+this.indirizzo+
				"\nNumero di telefono: "+this.numeroTelefono+"\n";
	}
}
