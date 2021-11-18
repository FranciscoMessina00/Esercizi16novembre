package esercizio1;

public class Numero implements Ritorno{
	private int p;
	public Numero(int p){
		this.p=p;
	}
	
	public int getRitorno(){
		return this.p;
	}
}