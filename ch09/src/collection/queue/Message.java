package collection.queue;

public class Message {
	
	String command; //수행 - 이메일, SMS, Kakaotalk
	String to;
	
	Message(String command, String to){
		this.command = command;
		this.to = to;
	}

}
