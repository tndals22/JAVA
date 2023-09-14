package tut01;

public class Tut01Ex {

	public static void main(String[] args) {
		// 아이디와 비밀번호가 모두 일치하면 마이페이지로 이동합니다.
		// 일치하지 않으면 "회원정보를 확인하세요".
		// 회원가입 정보 (아이디,비번) = 로그인 정보 (아이디, 비번)
		// DataBase 값을 정하는 변수 이름은 단어와 단어가 이어질 때 _
		
		// 회원가입 정보(db)
		String DB_USERID = "koreait";
		String DB_PASSWD = "12345";
		
		// 로그인 정보(db) : 입력
		String userid = "koreait";
		String passwd = "12345";
		int point = 1000;
		
		if(DB_USERID.equals(userid) && DB_PASSWD.equals(passwd)) { // .equals => 문자열 비교  && => 두 조건이 같으면 true, 아니면 false
				System.out.println( DB_USERID + " 회원님 안녕하세요. 마이페이지로 이동합니다.");
				System.out.println(point += 100);
				
		} else { 
			System.out.println("로그인 정보를 확인하세요.\n회원가입 페이지로 이동합니다.");
			System.out.println("보유한 포인트" + point + "점");
		}
		System.out.println("========= 삼항 연산자 ==========");
		// 타입 변수 = (조건) ? "참" : "거짓"; => 삼항 연산자
			String login = DB_USERID.equals(userid) && DB_PASSWD.equals(passwd) ? DB_USERID + "회원님 안녕하세요. 마이페이지로 이동합니다."
						: "로그인 정보를 확인하세요.\n회원가입 페이지로 이동합니다.";
			System.out.println(login);
					
	}

}
