package dateex;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

// 구버전 -> Java 1.7 이하
// java.sql.Date
// java.sql.Time (X)
// jave.sql.Timestamp
// java.utill.Calendar (X)
// java.utill.Date

// 신버전 -> Java 1.8 이상
// java.time.LocalDate
// java.time.LocalDateTime
// java.time.LocalTime

public class TimeEx01 {

	public static void main(String[] args) {
		// Calendar은 안 쓰지만 오래된 프로그램쓰는 회사는 가끔 쓴다.
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String today = formater.format(cal.getTime());
		System.out.println("today : " + today);
		
		// 2. java.utill.Date -> 이것도 잘 안쓰지만 오래된 프로그램쓰는 회사에 있을 수도 있음
		// Date는 1970.01.01을 기준으로 경과된 (밀리)초를 계산한다.
		Date time2 = new Date();
		System.out.println("time2 : " + time2);
		System.out.println("time2.getTime() : " + time2.getTime());
		String today2 = formater.format(time2);
		System.out.println("today2 : " + today2);
		
		// 3. java.sql.Date -> 안씀 
		java.sql.Date time3 = new java.sql.Date(24*3600*1000);
		System.out.println("time3 : "+ time3);
		
		// 4. java.sql.Timestamp
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date d = new Date();
		String timestamp = sf.format(d.getTime());
		Timestamp ts = Timestamp.valueOf(timestamp);
		System.out.println("ts : "+ ts);
		
		// 5. LocalDateTime (LocalDate to Timestamp)
		Timestamp nowDate = Timestamp.valueOf(LocalDateTime.now());
		System.out.println("nowDate : " + nowDate);
		
		// 6. LocalDateTime (Timestamp to LocaldateTime)
		LocalDateTime ldt = nowDate.toLocalDateTime();
		System.out.println("ldt : "+ ldt);
		
		System.out.println("LocalDateTime : " + LocalDateTime.now());
		System.out.println("LocalDate : " + LocalDate.now());
		System.out.println("LocalTime : " + LocalTime.now());
	}

}
