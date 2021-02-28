package javaUtil.exam;

// Runnable�� �����ϴ� DaemonThreadŬ������ �ۼ�
public class DaemonThread implements Runnable {

    // ���ѷ����ȿ��� 0.5�ʾ� ���鼭 ���󾲷��尡 �������Դϴٸ� ����ϵ��� run()�޼ҵ带 �ۼ�
    @Override
    public void run() {
        while (true) { //���ѷ���
            System.out.println("���� �����尡 �������Դϴ�.");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break; //Exception �߻��� while�� ����� 
            }
        }
    }

    public static void main(String[] args) {
        // Runnable�� �����ϴ� DaemonThread�� �����ϱ� ���Ͽ� Thread ����
        Thread th = new Thread(new DaemonThread());
        // ���󾲷���� ����
        th.setDaemon(true);
        // �����带 ����
        th.start();

        // ���� �����尡 1�ʵڿ� ����ǵ��� ����. 
        // ���󾲷���� �ٸ� �����尡 ��� ����Ǹ� �ڵ�����.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }   
        System.out.println("���� �����尡 ����˴ϴ�. ");    
    }   
}
