package MultiTreading;

public class Application {
	public static void main(String[] args) {
		System.err.println("hello there...");
		Task1 taskRunner1 = new Task1("Thread-A");
		taskRunner1.start();
		
		Task1 taskRunner2 = new Task1("Thread-B");
		taskRunner2.start();
		
		Task2 task2Runner = new Task2();
		task2Runner.run();
		Thread t1=new Thread(task2Runner);
		t1.start();
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
//				Thread.currentThread().setName(this.name);
				for (int i = 0; i < 10; i++) {
					System.err.println("number is: " + i + "-" + Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				 
				
			}
			
		});
		t2.start();
 

	}

}

class Task1 extends Thread {
	String name;
	public Task1(String name) {
		this.name=name;
		
	}
	public void run() {
		Thread.currentThread().setName(this.name);
		for (int i = 0; i < 10; i++) {
			System.err.println("number is: " + i + "-" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

class Task2 implements Runnable {
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.err.println("number is: " + i + "-" + Thread.currentThread().getName());

		}
	}

}
