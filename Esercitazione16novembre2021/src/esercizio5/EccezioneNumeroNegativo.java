package esercizio5;

public class EccezioneNumeroNegativo extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	EccezioneNumeroNegativo(){
		super();
	}
	EccezioneNumeroNegativo(String msg){
		super(msg);
	}
}
