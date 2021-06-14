
public class Sheep extends Animal implements Cloneable {

	private String name; 
	
	public Sheep(String name) {
		super();
		this.name = name;
	}

	public Sheep() {
		super();
	}

	@Override
	public String getCountString() {
		return getCount() + " " + name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
}
