package dateex;

import java.util.Calendar;

public class CalendarEx {

	// 2020-03-18:22:11:05
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR); // 2020ÀÌ ³ª¿Â´Ù.
		int month = cal.get(Calendar.MONTH)+1;
		String mon = (month<10) ? "0" + month : "" + month;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(year + "-" + mon + "-" + day+":" + hour +":"+min + ":" + second);
	}
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // ½Ì±ÛÅæ
		printCalendar("ÇöÀç", now);
	}

}
