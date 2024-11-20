package lambdaEx;

public class MyFnInterfaceEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterfaceEx02 fi;
		fi = (x, y) -> {
			int result = x+y;
			return x+y;
		};
		System.out.println(fi.method(2, 5));
	}
	
	public static int sum(int x, int y) {
		return x+y;
		
	}
}
