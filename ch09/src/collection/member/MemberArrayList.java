package collection.member;

import java.util.ArrayList;

//자료 관리 클래스(생성, 조회) - DAO(Data Access Object)
public class MemberArrayList {
	
	//필드 - 자료 구조 명시
	private ArrayList<Member> arrayList;
	
	//생성자
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	//회원 추가
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//회원 목록 조회
	public void showAllMember() {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//회원의 전체 인원
	public int getSize() {
		return arrayList.size();
	}
	
	//회원 삭제
	//이미 등록된 회원번호와
	//매개로 전달된 회원아이디를 비교해서있으면 삭제함
	public boolean removeMember(int memberId) {
		for(int i =0; i < arrayList.size(); i++) {
			int abId = arrayList.get(i).getMemberid(); //이미 등록된 회원번호
			if(abId == memberId) { //외부 아이디와 비교해서 일치하면
				arrayList.remove(i); //member 객체를 삭제함
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;	
	}

}

