package esercizio3;

public class Scultura extends OperaDArte{
	private double altezza, larghezza, profondita;
	public Scultura(String titolo, String artista, double altezza, double larghezza, double profondita) {
		super(titolo, artista);
		this.altezza=altezza;
		this.larghezza=larghezza;
		this.profondita=profondita;
	}
	public double ingombro() {
		return this.altezza*this.larghezza*this.profondita;
	}
	@Override
	public String toString() {
		return "\nTitolo: "+this.titolo+
				"\nArtista: "+this.artista+
				"\nDimemsioni: "+this.altezza+" x "+this.larghezza+" x "+this.profondita+" cm\n";
	}

}
