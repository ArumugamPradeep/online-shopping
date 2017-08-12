package kan.electronicsbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kan.electronicsbackend.dao.CategoryDAO;
import kan.electronicsbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("kan.electronicsbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

	}

	/*
	 * @Test public void testAddCategory() { category = new Category();
	 * category.setName(" Television"); category.setDescription("description");
	 * category.setImageURL("CAT_103.png");
	 * 
	 * assertEquals ("Successfully added category inside table!!", true,
	 * categoryDAO.add(category));
	 * 
	 * }
	 */

	/*
	 * @Test public void testGetCategory() {
	 * 
	 * category = categoryDAO.get(2);
	 * assertEquals("Successfully fetched a single category from table!!"
	 * ," Mobile", category.getName());
	 * 
	 * }
	 */
	/*
	 * @Test public void testUpdateCategory() {
	 * 
	 * category = categoryDAO.get(3); category.setName("TV");
	 * 
	 * assertEquals("Successfully updated a single category in table!!",true,
	 * categoryDAO.update(category));
	 * 
	 * }
	 */
	/*
	 * @Test public void testdeleteCategory() {
	 * 
	 * category = categoryDAO.get(3);
	 * 
	 * assertEquals("Successfully deleted a single category in table!!", true,
	 * categoryDAO.delete(category)); }
	 */

	/*@Test
	public void testListCategory() {
		 
		 assertEquals("Successfully fetched list of category in table!!",1, categoryDAO.list().size());
		 }
*/
	
	
	@Test
	public void testCRUDCategory() {
         //ADD
		category = new Category();
		category.setName("Laptop");
		category.setDescription("For Esy Transport ");
		category.setImageURL("CAT_1.png");

		assertEquals("Successfully added category inside table!!", true, categoryDAO.add(category));

		category = new Category();
		category.setName("Television");
		category.setDescription("Time Pass");
		category.setImageURL("CAT_2.png");

		assertEquals("Successfully added category inside table!!", true, categoryDAO.add(category));

		category = new Category();
		category.setName("Mobile");
		category.setDescription("World in our Hand");
		category.setImageURL("CAT_3.png");

		assertEquals("Successfully added category inside table!!", true, categoryDAO.add(category));


		
		//FETCHING AND UPDATING
		
		 category = categoryDAO.get(2); 
		 category.setName("TV"); 
		  assertEquals("Successfully updated a single category in table!!",true, categoryDAO.update(category));
		 
		
		//DELETING
		  assertEquals("Successfully deleted a single category in table!!",true, categoryDAO.delete(category));
		
		//FETCHING
		  assertEquals("Successfully fetched list of category in table!!",2, categoryDAO.list().size()); 
					
	}
	
}
