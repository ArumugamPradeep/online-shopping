package kan.electronicsbackend.dao;

import java.util.List;

import kan.electronicsbackend.dto.Category;

public interface CategoryDAO {

	
	boolean add(Category category);
	
	List<Category> list();
	Category get(int id);
	
}
