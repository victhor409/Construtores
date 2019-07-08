package entites;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
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
