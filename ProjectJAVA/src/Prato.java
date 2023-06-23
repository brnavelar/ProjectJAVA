
public abstract class Prato {
	public int num;
	public String name;
	public String description;
	public double price;
	
	public Prato() {
		
	}
	
	public Prato(int num, String name, String description, double price) {
		this.num = num;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public abstract double calcPrice();
	
}
