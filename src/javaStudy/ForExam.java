package javaStudy;

public class ForExam {

	public static void main(String[] args) {
		int total = 0;
		for(int i=1; i<=100; i++) {
//			if(i%2==0) {
//				continue; //이상 수행하지 않고 다음 for로 수행
//			}
			total = total + i;
			if(i==50) break;
		}
		
		System.out.println(total);

	}

}
