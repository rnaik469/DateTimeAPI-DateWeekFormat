package in.co.cg;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

//This class format Local date into "EEEE, MMMM dd, yyyy" format
public class DateWeekformat {
	public static void main(String[] args) {

		Date date = new Date();// Date object
		SimpleDateFormat format = new SimpleDateFormat("EEEE, MMMM dd, yyyy");// Formatting date
		System.out.println(format.format(date));
	}
}
