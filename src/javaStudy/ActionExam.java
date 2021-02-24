package javaStudy;

public class ActionExam {

	public static void main(String[] args) {
//		Action action = new MyAction();
//		action.exec();
		Action action = new Action() { //이름없는 객체생성, 즉 익명클래스, 해당 클래스에서만 사용할 경우에 사용.
			@Override
			public void exec() {
				System.out.println("exec");
			}
		};
		action.exec();
	}

}
