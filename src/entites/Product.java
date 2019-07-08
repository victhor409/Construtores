package entites;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	//sobrecarga
	public Product() {
		
	}
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	//fim da sobre carga

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double TotalValueInStock() {
		return quantity * price;
	}
	
	public int AddProducts(int quantity) {
		return this.quantity += quantity;
	}
	
	public void RemoveProduct(int quantity) {
		this.quantity -= quantity;
	}
	public String toString()  {
		return name
		+ " , $ "
		+  price
		+ " , "
		+ quantity
		+ "  Units , Total: $"
		+ String.format("%.2f",TotalValueInStock());
	}
}
