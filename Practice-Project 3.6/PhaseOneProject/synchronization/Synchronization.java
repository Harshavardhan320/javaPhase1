package synchronization;

public class Synchronization {
	int count =0;
	public void methodcount(int n) {
		synchronized(this) {
			count +=n;
		}
	}
	public static void main(String arr[]) {
		Synchronization m =new Synchronization();
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int a=0; a<=100; a++) {
					m.methodcount(a);
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int a=0; a<=100; a++) {
					m.methodcount(a);
				}
			}
		});
		thread1.start();
//		try {
//			thread1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		thread2.start();
//		try {
//			thread2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		synchronized(thread1) {
			try {
				thread1.wait();
			}catch(InterruptedException e) {
				System.out.println("error");
			}
		}
		
		System.out.println("Final count is "+m.count);
		
		
	}
}



