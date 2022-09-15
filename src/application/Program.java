package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: Seller findByID ===");
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Test 2: Seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerdao.findByDepartment(department);
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test 3: Seller findAll ===");
		list = sellerdao.findAll();
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test 4: Seller Insert ===");
		Seller newseller = new Seller(null, "Joao", "joao@gmail.com", new Date(), 4000.0, department);
		sellerdao.insert(newseller);
		System.out.println("Inserted! New id = " + newseller.getId());
	}

}
