package esercizio3;
import java.util.ArrayList;

public class CollezioneDArte {
	private String nome, luogo;
	ArrayList<OperaDArte> opere=new ArrayList<OperaDArte>();
	
	public CollezioneDArte(String nome, String luogo, ArrayList<OperaDArte> opere) {
		this.luogo=luogo;
		this.nome=nome;
		this.opere=opere;
	}
	public void inserisciOpera(OperaDArte opera) {
		opere.add(opera);
	}
	
	public void accediOpera(OperaDArte o) {
		System.out.println(o);
	}
	public String toString() {
		return "\nNome collezione: "+this.nome+
				"\nLuogo: "+this.luogo+
				"\nOpere: "+this.opere;
	}
}
