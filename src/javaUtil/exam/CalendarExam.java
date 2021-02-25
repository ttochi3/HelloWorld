package javaUtil.exam;

import java.util.Calendar;

public class CalendarExam {
    public String hundredDaysAfter(){
        //���ú��� 100�� ���� ��¥�� "2016��1��1��"�� �������� return�ϼ���.
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,100);
        return cal.get(Calendar.YEAR)+"��"+(cal.get(Calendar.MONTH)+1)+"��"+cal.get(Calendar.DATE)+"��";
    }

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); //Java�� ���� 0~11�� ǥ���Ѵ�.
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(Calendar.HOUR, 5); //5�ð� ����.

		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); //Java�� ���� 0~11�� ǥ���Ѵ�.
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		
        CalendarExam calEx = new CalendarExam();
        System.out.println(calEx.hundredDaysAfter());
		
	}

}
