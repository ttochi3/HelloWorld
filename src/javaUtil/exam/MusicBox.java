package javaUtil.exam;

public class MusicBox {
    public synchronized void playMusicA() { //synchronized �� �߰��ϸ� ������ Thrend�� ������� �����.
    	for(int i=0; i<10; i++) {
    		System.out.println("�ų��� ����!!!");
    		
    		try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
    public synchronized void playMusicB() {
    	for(int i=0; i<10; i++) {
    		System.out.println("���� ����!!!");
    		
    		try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
    public void playMusicC() {
    	for(int i=0; i<10; i++) {
    		synchronized (this) {
    			System.out.println("ī�� ����!!!");
    		}
    		
    		try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
}
