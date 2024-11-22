package nonGenraric;

public class BoxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		box.setObject("홍길동"); //String
		
		String name = (String)box.getObject(); //object=> string (강제 변환)
		System.out.println(name);
		
		box.setObject(new Apple()); // Apple => Object(자동 타입 변환)
		Apple apple = (Apple)box.getObject(); // Object => Apple(강제 타입 변환)
		System.out.println(apple);
	} //map(function.apply()) 
	
}
