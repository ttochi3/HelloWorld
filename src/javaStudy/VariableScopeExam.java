package javaStudy;

public class VariableScopeExam {
	
	int globalScope = 10;
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}

	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(value2);
		
	}
	
	public static void main(String[] args) {
		//System.out.println(globalScope); //에러발생, main메서드에는 static 때문, 
		//키워드 static 을 사용하면 인스턴스화 하지 않아도 사용할 수 있다.
		//그러므로 static 한 메서드에서 static 하지 않은 변수는 사용할 수 없음.
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(staticVal);
		
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal); //static변수는 하나만 생성.
		//클래스 변수 : static 한 변수, 값을 저장할 수 있는 공간이 하나밖에 없어서 값을 공유한다.
		System.out.println(VariableScopeExam.staticVal); //클래스 변수로 직접 접근가능.
	}

}
