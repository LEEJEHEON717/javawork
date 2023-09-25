package threads.threadname;

public class ThreadA extends Thread {
	
	public ThreadA() {
		this.setName ("THreadA");
	}

	@Override
	public void run() {
		// ThreadA의 이름 - getName()
		for (int i = 0; i < 2; i++){
			System.out.println(this.getName() + "가 출력한 내용");
		}
	}

}
