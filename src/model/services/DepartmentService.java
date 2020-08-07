package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao departamentDAO = DaoFactory.createDepartmentDao();
	
	public List<Department> findAll() {
		return departamentDAO.findAll();
	}
	
	public void saveOrUpdate(Department object) {
		if (object.getId() == null) {
			departamentDAO.insert(object);
		} else {
			departamentDAO.update(object);
		}
	}
}