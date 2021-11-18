package esercizio5;

public class Main {

	public static void main(String[] args) {
		Staff staff=new Staff();
		long n1=3663457091L;
		long n2=3873468378L;
		long n3=3779274895L;
		
		try {
			
			if(n1<=100000000L||n2<=1000000000L||n3<=1000000000L) {
				throw new EccezioneNumeroNegativo();
			}
		} catch (EccezioneNumeroNegativo e) {
			System.out.println("Inserire un numero di telefono valido");
		}
		
		Personale p1=new Volontario("Francisco Messina", "Via Como", n1);
		Personale p2=new Giornaliero("Anna Mantovani", "Via Ancona", n2, 30);
		Personale p3=new Impiegato("Silvio Cedame", "Via Torino", n3, 10);
		staff.addPersonale(p1);
		staff.addPersonale(p2);
		staff.addPersonale(p3);
		
		System.out.println(staff);
	}

}
