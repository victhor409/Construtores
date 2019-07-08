import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Product Data:");
        System.out.print("Name: ");
        String name=sc.nextLine();
        System.out.print("Price: ");
        double price=sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity=sc.nextInt();
        
        //os atributos estao recebendo os valores das variaveis locais
        Product product = new Product(name, price, quantity);
        
        System.out.println();
        System.out.print("Product data: "+product.name+" , "+product.price+" , "+product.quantity+" Units , $: "+product.TotalValueInStock());
        System.out.println();
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int add = sc.nextInt();
        product.AddProducts(add);
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
