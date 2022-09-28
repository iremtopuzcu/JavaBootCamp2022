package classesWithAttributes;

public class Product {
	
	public Product(int id,String name,String description,double price,int stockAmount) {
		System.out.println("yapici blok calisti...");
		this.id = id;
		this.name=name;
		this.price=price;
		this.description=description;
		this.stockAmount=stockAmount;
	}
	
	
// Bunlar bildiğimiz değişkenler fakat bu şekilde kullandığımızda "ATTRİBUTE" veya "FIELD" denir.
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	
	
	

}
