package esericizio2;

public class Mul implements Operazione{
	public long mul;
	public Mul(long add1, long add2) {
		this.mul=add1*add2;
	}

	public long operazione() {
		return this.mul;
	}
	
}
