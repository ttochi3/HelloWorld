package javaStudy;

public class EnumExam {
    public static final String MALE = "MAIL";
    public static final String FEMALE = "FEMALE";
	public static void main(String[] args) {
		//������
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;
        
        gender1 = "boy";
        
        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;
        
        //gender2 = "boy"; //������ �� �ٸ� ���� ���� �� ����.
	}

}
//������ ����
enum Gender {
	MALE, FEMALE;
}