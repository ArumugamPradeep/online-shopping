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
	 
	@Test
	public void testGetCategory() {

		category = categoryDAO.get(2);
		assertEquals("Successfully fetched a single category from table!!"," Mobile", category.getName());

	}

}
