package MapEx;

import java.util.*;


public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new java.util.HashMap<String, String>();
		map.put("test001", "a1111");
		map.put("test002", "a1431");
		
		for(String k : map.keySet()) {
			System.out.println("id : " +k + ", password : " + map.get(k));
		}
		
	}

}