package esercizio1;

public class Quadrato implements Ritorno{
	private int p;
	public Quadrato(int p){
		this.p=p*p;
	}
	
	public int getRitorno(){
		return this.p;
	}
}