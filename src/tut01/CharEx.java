package tut01;

public class CharEx {
	public static void main(String[] args) {
		
		char c = 'a';
		String str  = "b";
		int ch = 'a'; // ASCII코드 
		
		System.out.println(c);
		System.out.println(str);
		System.out.println( (char)(ch + 2) );
		
		System.out.println("========================");
		
		//회원가입 했을 때 저장한 아이디, 비밀번호 
		String userid = "koreait";
		String passwd = "12345";
		
		//내가 지금 입력한 아이디, 비밀번호 
		String userid2 = "seoul";
		String passwd2 = "67867";
		
		// ! => not 부정
		if( !userid.equals(userid2) ) { // .equals => 문자열을 비교하는 
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("가입된 회원이 아닙니다.\n회원가입 해주세요");
		}
		
		
		
		
		
		
		
		
	}

}