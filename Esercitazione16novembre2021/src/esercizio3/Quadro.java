package esercizio3;

public class Quadro extends OperaDArte{
	private double altezza, larghezza;
	public Quadro(String titolo, String artista, double altezza, double larghezza) {
		super(titolo, artista);
		this.altezza=altezza;
		this.larghezza=larghezza;
	}

	public double ingombro() {
		return this.altezza*this.larghezza;
	}

	public String toString() {
		return 	"\nTitolo: "+this.titolo+
				"\nArtista: "+this.artista+
				"\nDimemsioni: "+this.altezza+" x "+this.larghezza+" cm\n";
	}
}
