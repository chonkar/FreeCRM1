package StepDefinition;

import Implementation.Product;
import Implementation.SearchProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	Product product;
	SearchProduct searchproduct;

@Given("I have a search field on Amazon Page")
public void i_have_a_search_field_on_amazon_page() {
    System.out.println("Step 1: I am on search page");
}

 	;

@When("I search for the Product with name {string} and {int}")
public void i_search_for_the_product_with_name_and(String productName, Integer price) {
    System.out.println("Step 2: Search the product with name: "
    		+productName + "and" + price);
   
    product=new Product(productName,price);
}

@Then("Product with name {string} should be displayed")
public void product_with_name_should_be_displayed(String productName) {
    System.out.println("Step 3: product" +productName+ "is Displayed");
    searchproduct= new SearchProduct();
    searchproduct.displaytheProduct(product)
}

}
