package ArrayListEx;

public class Product {
	private int prdNum;
	private String prdName;
	private int pridPrice;
	
	public Product(int prdNum, String prdName, int pridPrice) {
		this.prdNum = prdNum;
		this.prdName = prdName;
		this.pridPrice = pridPrice;
	}

	public int getPrdNum() {
		return prdNum;
	}

	public void setPrdNum(int prdNum) {
		this.prdNum = prdNum;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public int getPridPrice() {
		return pridPrice;
	}

	public void setPridPrice(int pridPrice) {
		this.pridPrice = pridPrice;
	}
	
	@Override
	public String toString() {
		return "Product [prdId = " + prdNum + ", prdName = " + prdName
				+ ", prdPrice = " + pridPrice;
	}

}
