package javaUtil.exam;

import java.util.Calendar;

public class CalendarExam {
    public String hundredDaysAfter(){
        //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,100);
        return cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH)+1)+"월"+cal.get(Calendar.DATE)+"일";
    }

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); //Java는 월을 0~11로 표현한다.
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(Calendar.HOUR, 5); //5시간 더함.

		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); //Java는 월을 0~11로 표현한다.
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		
        CalendarExam calEx = new CalendarExam();
        System.out.println(calEx.hundredDaysAfter());
		
	}

}
