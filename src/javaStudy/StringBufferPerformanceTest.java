package javaStudy;

public class StringBufferPerformanceTest{
    public static void main(String[] args){
        // (1) String�� +������ �̿��ؼ� 10,000���� *�� �̾���Դϴ�.
        //���۽ð��� ����մϴ�.(millisecond����)
        long startTime1 = System.currentTimeMillis();
        String str="";
        for(int i=0;i<10000;i++){
            str=str+"*";
        }
        //����ð��� ����մϴ�.(millisecond����)
        long endTime1 = System.currentTimeMillis();
        
        // (2) StringBuffer�� �̿��ؼ� 10,000���� *�� �̾���Դϴ�.
        //���۽ð��� ����մϴ�.(millisecond����)                
        long startTime2 = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<10000;i++){
            sb.append("*");
        }
        //����ð��� ����մϴ�.(millisecond����)
        long endTime2 = System.currentTimeMillis();
        
        // ���(1)�� ���(2)�� �ɸ� �ð��� ���մϴ�.
        long duration1 = endTime1-startTime1;
        long duration2 = endTime2-startTime2;
        
        System.out.println("String�� +������ �̿��� ��� : "+ duration1);
        System.out.println("StringBuffer�� append()�� �̿��� ��� : "+ duration2);
    }
}