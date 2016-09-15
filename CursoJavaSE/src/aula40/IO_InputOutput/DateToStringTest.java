package aula40.IO_InputOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToStringTest {
	
	public static void main(String[] args) throws ParseException {
		
		String d = "10/05/1982";
		Calendar c = stringToCalendarConverter(d);
		
		long ms = c.getTimeInMillis();
		
		System.out.println(ms);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d2 = new Date(ms);
		System.out.println( sdf.format(d2) );
		
		
	}
	
	public static Calendar stringToCalendarConverter(String data) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();

		try {
			
			Date d = sdf.parse(data);
			c.setTime(d);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		return c;
	}
	

}
