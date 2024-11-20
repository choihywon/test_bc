package helloworld;

import java.util.ArrayList;

public class MemberDAO implements IMemberDAO {

	@Override
	public void insertMember(MemberDTO dto) {
		// 컨트롤러에게 전달 받은 값을 DB에 저장했다고 가정
		System.out.println("회원 등록 성공");
		//DTO값 출력
		System.out.println(dto);
	}

	@Override
	public void deleteMember(Long memID) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<MemberDTO> getAllMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// TODO Auto-generated method stub

	}

}
