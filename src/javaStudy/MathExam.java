package javaStudy;

public class MathExam {

	public static void main(String[] args) {
		int value1 = Math.max(5,30);
		System.out.println(value1);

		int value2 = Math.min(5,30);
		System.out.println(value2);
		
		System.out.println(Math.abs(-10));
		
		System.out.println(Math.random());
		
		System.out.println(Math.sqrt(25));
		
        System.out.println("2ÀÇ 10½Â = " + Math.pow(2, 10));
        System.out.println("16ÀÇ 1/2½Â = : " + Math.pow(16, 0.5));
        System.out.println("16ÀÇ Á¦°ö±Ù = : " + Math.sqrt(16));
        System.out.println("log200 = " + Math.log10(200));
        System.out.println("10ÀÇ 2.3010299956639813½Â = " + Math.pow(10,2.3010299956639813));
        System.out.println("log(e)200 = " + Math.log(200));
	}

}
