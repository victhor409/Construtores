package entites;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
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
