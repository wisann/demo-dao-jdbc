package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Department dep = new Department(null, "Music");
		DepartmentDao dao = DaoFactory.createDepartmentDao();
		System.out.println("TESTE 1 INSERT DEPARTMENT");
		//dao.insert(dep);
		System.out.println("inserted! new id = " + dep.getId());
		
		System.out.println("TESTE 2 UPDATE DEPARTMENT");
		//Department dep2 = new Department(5, "Dance");
		//dao.update(dep2);
		System.out.println("Department updated!");

		System.out.println("TESTE 3 delete DEPARTMENT");
		//dao.deleteById(7);
		System.out.println("sucessfully deleted ");
		
		System.out.println("TESTE 4 find by id DEPARTMENT");
		dep = dao.findById(2);
		System.out.println(dep);
		
		System.out.println("TESTE 5 find all DEPARTMENT");
		List<Department> lista = new ArrayList<>();
		lista = dao.findAll();
		for(Department obj : lista) {
			System.out.println(obj);
		}

	}

}
