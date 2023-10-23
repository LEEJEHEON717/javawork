package layouts;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginWindow {

	public static void main(String[] args) {
		// 프레임 =- 윈도우 전체
		JFrame frame = new JFrame("레이아웃 예제");
		frame.setSize(100, 20);
		frame.setLocation(100, 100);

		// 제목 표시줄 - 내용
		frame.setTitle("Login");
		frame.setSize(300, 250); // 300px-너비, 200px-높이
		frame.setLocation(200, 100); // x좌표 - 100, y좌표 - 100
		frame.setLayout(null); // 레이아웃 객체가 없는 상태

		// 레이블(글자 출력) - "아이디"
		JLabel label1 = new JLabel("아이디");
		label1.setSize(80, 30);
		label1.setLocation(40, 50); // x좌표, y좌표
		frame.add(label1); // 프레임에 라벨을 추가해야 화면에 출력됨
		// 입력상자
		JTextField text1 = new JTextField();
		text1.setSize(130, 30);
		text1.setLocation(110, 50); // x좌표, y좌표
		frame.add(text1); // 프레임에 라벨을 추가해야 화면에 출력됨

		// 레이블(글자 출력) - "비밀번호"
		JLabel label2 = new JLabel("비밀번호");
		label2.setSize(80, 30);
		label2.setLocation(40, 90); // x좌표, y좌표
		frame.add(label2); // 프레임에 라벨을 추가해야 화면에 출력됨
		// 입력상자
		JTextField text2 = new JTextField();
		text2.setSize(130, 30);
		text2.setLocation(110, 90); // x좌표, y좌표
		frame.add(text2); // 프레임에 라벨을 추가해야 화면에 출력됨

		// 버튼 생성 - "로그인"
		JButton button = new JButton("로그인");
		button.setSize(80, 30);
		button.setLocation(100, 150);
		frame.add(button);

		// 윈도우 종료(닫기)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 윈도우 디스플레이
		frame.setVisible(true);
	}
}
