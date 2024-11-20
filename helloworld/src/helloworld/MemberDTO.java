package helloworld;

public class MemberDTO {
	private Long memID;
	private String memName;
	
	//생성자
	public MemberDTO(Long memId, String memName) {
		this.memID = memID;
		this.memName = memName;
	}
	//Getters & Setters
	public Long getMemID() {
		return memID;
	}

	public void setMemID(Long memID) {
		this.memID = memID;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
		//return "MemberDTO [memId  =" + memID + ", memName = " +memName + "]";
	}
	
}
