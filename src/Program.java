import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        
        System.out.println("Enter Product Data:");
        System.out.print("Name: ");
        product.name=sc.nextLine();
        System.out.print("Price: ");
        product.price=sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity=sc.nextInt();
        System.out.println();
        System.out.print("Product data: "+product.name+" , "+product.price+" , "+product.quantity+" Units , $: "+product.TotalValueInStock());
        System.out.println();
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.println();
        System.out.printf("Updated data: "+product);
        System.out.println();
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        int removed = sc.nextInt();
        product.RemoveProduct(removed);
        System.out.println();
        System.out.println("Updated: " + product);
        
        sc.close();

	}

}
