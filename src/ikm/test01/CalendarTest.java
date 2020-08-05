package ikm.test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
public static void main(String args[]) {
Date aDate = null;
try {
aDate = new SimpleDateFormat("yyyy-mm-dd").parse("2012-01-15");
Calendar aCalendar = Calendar.getInstance();
aCalendar.setTime(aDate);
System.out.print(aCalendar.get(Calendar.DAY_OF_MONTH)+"," + aCalendar.get(Calendar.MONTH));}
catch (ParseException ex) {System.out.println(ex);}
}
}