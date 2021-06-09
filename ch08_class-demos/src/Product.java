
public abstract class Product {
	
	//p. 217
	// Pojo (Plain Old Java Object), Business Class, or Java Bean
	// 1)  create instance variables
	// 2)  generate / create constructor(s)
	// 3)  generate / create getters/setters
	// 4)  Optional:  toString()
	private String code;
	private String description;
	private double price;
	// for static demo only - don't do this!!!!
	public static String staticVariable;
	
	// default / empty constructor
	public Product() {
		// by default Java sets primitive numeric types 
		// to 0 and String types to null
	}

	// fully loaded constructor
	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return description;
	}

	@Override
	public boolean equals(Object obj) {
		boolean sameData = false;
		if (obj instanceof Product) {
			Product p = (Product)obj;
			if (p.getCode().equals(code)) {
				sameData = true;
			}
		}
		return sameData;
	}
	
	

}
