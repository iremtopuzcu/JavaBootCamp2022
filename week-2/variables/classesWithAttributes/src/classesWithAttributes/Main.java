package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product( );
		
		
		
		
		
		product.setName("laptop");
		product.setId(1);
		product.setDescription("asus");
		product.setPrice(9000);
	    product.setStockAmount(3);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getName());
		

	}

}
