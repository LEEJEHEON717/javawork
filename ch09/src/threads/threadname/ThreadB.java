package threads.threadname;

public class ThreadB extends Thread {
	
	public ThreadB() {
		this.setName ("THreadB");
	}

	@Override
	public void run() {
		// ThreadB의 이름 - getName()
		for (int i = 0; i < 2; i++){
			System.out.println(this.getName() + "가 출력한 내용");
		}
	}

}
