package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		System.out.println("TESTE 1 FINDBYID: ");
		SellerDao sellerdao = DaoFactory.createSellerDao();
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);
		
		System.out.println("TESTE 2 FINDBYDEPARTMENT: ");
		Department department = new Department(2,null);
		List<Seller> list = sellerdao.findByDepartment(department);
		for (Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println("TESTE 3 sellerfinall: ");
		list = sellerdao.findAll();
		for (Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println("TESTE 4 new Seller: ");
		Seller newSeller = new Seller(null, "wisan", "wisan@gmail.com", new Date(), 4000.00, department);
		sellerdao.insert(newSeller);
		System.out.println("inserted! new id = " + newSeller.getId());

	}
	
		
}
