package esericizio2;

public class Sub implements Operazione{
	public long sub;
	public Sub(long add1, long add2) {
		this.sub=add1-add2;
	}

	public long operazione() {
		return this.sub;
	}
	
}
