package xyz;
class carr implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("BMW car  is moving "+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
			}
		}
	}
}
class bikee implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("ninga bike is moving "+i );
			try {
				Thread.sleep(500);
			}catch(Exception e) {
			}
		}
	}
}

public class Simplee {
	public static void main(String [] args) {
		Thread caThread = new Thread(new carr());
		Thread baThread = new Thread(new bikee());
		System.out.println("gooo");
		caThread.start();
		baThread.start();
		
	}

}

