package esercizio5;
import java.util.ArrayList;

public class Staff {
	private ArrayList<Personale> personale= new ArrayList<Personale>();
	public Staff(ArrayList<Personale> personale) {
		this.personale=personale;
	}
	public Staff() {}
	public void addPersonale(Personale personale) {
		this.personale.add(personale);
	}
	
	public String toString() {
		return "\nIl nostro staff è composto dal seguente team: "+personale;
	}
}
