package domain;

//dto 클래스(자료 전달 객체), vo
public class User {
	//필드
	private String userId;
	private String userName;
	private String userPassword;
	private int userAge;
	private String userEmail;
	
	//기본 생성자
	public User() {}
	
	//매서드(getter/setter)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userAge="
				+ userAge + ", userEmail=" + userEmail + "]";
	}
}
