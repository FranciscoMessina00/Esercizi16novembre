package esericizio2;

public class Div implements Operazione{
	public long div;
	public Div(long add1, long add2) {
		this.div=add1/add2;
	}

	public long operazione() {
		return this.div;
	}
	
}
