package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		Seller sel = new Seller(2, "wisan", "wisan@gmail.com", new Date(), 3000.0, obj);
		System.out.println(sel);

	}

}
