package helloworld;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDTO dto = new MemberDTO(1L, "홍길동");
		
		MemberController c = new MemberController();
		c.insertMember(dto);
	}

}
