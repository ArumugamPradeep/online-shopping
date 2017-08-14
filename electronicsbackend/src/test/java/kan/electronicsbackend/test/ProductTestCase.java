package kan.electronicsbackend.test;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kan.electronicsbackend.dao.ProductDAO;
import kan.electronicsbackend.dto.Product;

public class ProductTestCase {
		
	private static AnnotationConfigApplicationContext context;
	private static ProductDAO productDAO;
	private Product product;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("kan.electronicsbackend");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");

	}

	@Test
	public void testCRUDCategory() {
         //ADD
		// create operation
		product = new Product();

		product.setName("oppo selfie s53");
		product.setBrand("oppo");
		product.setDescription("Description for oppo mobile");
		product.setUnitPrice(25000);
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);
		 
		assertEquals("Something went wrong while inserting a new product",true,productDAO.add(product));

		//reading and updating
		product = productDAO.get(2);
		product.setName("Samsung Galaxy S7");
		assertEquals("Something went wrong while updating the exising record",true,productDAO.update(product));


		assertEquals("Something went wrong while deleting the  existing record",true,productDAO.delete(product));

		
		//FETCHING
		  assertEquals("Something went wrong while fetching the list of products",6, productDAO.list().size()); 
					
	}


}
