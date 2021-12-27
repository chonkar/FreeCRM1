package Implementation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String ProductName;
	private int price;
	
	public Product(String productName, int price) {
		ProductName = productName;
		this.price = price;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<String> getProductList(){
		List<String> ProductList= new ArrayList<>();
		ProductList.add("Apple MacBook Pro");
		ProductList.add("Apple MacBook Air");
		ProductList.add("Apple iPhone 12 Pro");
		return ProductList;
	}
	
	
	
	
}
