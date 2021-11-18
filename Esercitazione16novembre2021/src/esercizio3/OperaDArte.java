package esercizio3;

public abstract class OperaDArte {
	protected String titolo, artista;
	public OperaDArte(String titolo, String artista) {
		this.artista=artista;
		this.titolo=titolo;
	}
	public void setArtista(String artista) {
		this.artista=artista;
	}
	public String getArtista() {
		return this.artista;
	}
	public void setTitolo(String titolo) {
		this.titolo=titolo;
	}
	public String getTitolo() {
		return this.titolo;
	}
	public abstract double ingombro();
	public boolean equals(Object o) {
		if (o instanceof OperaDArte) {
			OperaDArte op=(OperaDArte) o;
			return ((op.artista==this.artista)&&(op.titolo==this.titolo));
		}
		else return false;
	}
	
	public void printIngombro() {
		System.out.println(this.ingombro());
	}
	public abstract String toString();
}
