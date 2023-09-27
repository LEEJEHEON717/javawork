package bufferedstream;

import java.util.Arrays;

public class StringMethodTest {

	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		
		System.out.println(subject.charAt(4));
		
		System.out.println(subject.indexOf("프"));
		
		//split() 사용 - 구분 기호(, " ", :)
		String[] word = subject.split(" ");
		System.out.println(Arrays.toString(word));
		
		System.out.println(word[0]);
		System.out.println(word[1]);
		//System.out.println(word[2]);
		
		//전화 번호
		String phone = "010-1234-5678";
		String[] number = phone.split("-");
		System.out.println(Arrays.toString(number));

	}

}
