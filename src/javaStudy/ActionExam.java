package javaStudy;

public class ActionExam {

	public static void main(String[] args) {
//		Action action = new MyAction();
//		action.exec();
		Action action = new Action() { //�̸����� ��ü����, �� �͸�Ŭ����, �ش� Ŭ���������� ����� ��쿡 ���.
			@Override
			public void exec() {
				System.out.println("exec");
			}
		};
		action.exec();
	}

}
