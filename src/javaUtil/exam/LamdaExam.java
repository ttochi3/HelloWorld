package javaUtil.exam;

public class LamdaExam {

	public static void main(String[] args) {

//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for(int i=0; i<10; i++) {
//					System.out.println("hello");
//				}
//			}

		new Thread(()-> {
			for(int i=0; i<10; i++) {
				System.out.println("hello");
			}

		}).start();
	}

}
