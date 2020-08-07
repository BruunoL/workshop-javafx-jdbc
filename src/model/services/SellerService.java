package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {
	
	private SellerDao sellerDAO = DaoFactory.createSellerDao();
	
	public List<Seller> findAll() {
		return sellerDAO.findAll();
	}
	
	public void saveOrUpdate(Seller object) {
		if (object.getId() == null) {
			sellerDAO.insert(object);
		} else {
			sellerDAO.update(object);
		}
	}
	
	public void remove(Seller object) {
		sellerDAO.deleteById(object.getId());
	}
}