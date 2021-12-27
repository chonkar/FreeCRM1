package Implementation;

public class SearchProduct {
	
	public String displaytheProduct(Product product) {
		if(product.getProductList().contains(product.getProductName())) {
			return product.getProductName();
		}
		return null;
	}

}
