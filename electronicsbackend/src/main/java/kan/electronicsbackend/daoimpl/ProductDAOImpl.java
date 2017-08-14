package kan.electronicsbackend.daoimpl;

import java.util.List;

import kan.electronicsbackend.dao.ProductDAO;
import kan.electronicsbackend.dto.Product;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public Product get(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> listAciveProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> listAciveProductsByCategory(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getLatestAciveProducts(int count) {
		// TODO Auto-generated method stub
		return null;
	}

}
