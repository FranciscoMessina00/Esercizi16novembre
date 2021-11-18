package esericizio2;

public class Add implements Operazione{
	public long add;
	public Add(long add1, long add2) {
		this.add=add1+add2;
	}

	public long operazione() {
		return this.add;
	}
	
}
