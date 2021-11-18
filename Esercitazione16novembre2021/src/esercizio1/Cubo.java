package esercizio1;

public class Cubo implements Ritorno{
	private int p;
	public Cubo(int p){
		this.p=p*p*p;
	}
	
	public int getRitorno(){
		return this.p;
	}
}