
public class PratoPrincipal extends Prato {
	private String type;
	
	public PratoPrincipal() {
		
	}
	
	 public PratoPrincipal(String type, String name, String description, double price) {
	        super(name, description, price);
	        this.type = type;
	    }
	 

	    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

		public double calcPrice() {
	        return getPrice();
	    }
	}
