package ArrayListEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductMain {

	public static void main(String[] args) {
		ArrayList<Product> prdList = new ArrayList<Product>();
		
		Product p1 = new Product(1001, "모니터", 200000);
		Product p2 = new Product(1002, "키보드", 3000);
		Product p3 = new Product(1003, "모니터", 100);
		
		prdList.add(p1);
		prdList.add(p2);
		prdList.add(p3);
		
		for(int i =0; i< prdList.size(); i++) 
			System.out.println(prdList.get(i));
		for(Product prd : prdList) {
			System.out.println(prd);
		}
		Iterator<Product> it = prdList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
