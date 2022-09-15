package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: Seller findByID ===");
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);
	}

}
