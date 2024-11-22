package helloworld;

public class MemberController {
	MemberDAO dao = new MemberDAO();
	
	public void insertMember(MemberDTO dto) {
		dao.insertMember(dto);
	}

}
