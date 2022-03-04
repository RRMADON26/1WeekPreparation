package day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversionTest {

	private String timeConversion(String s) throws ParseException {

		if (s.contains("PM") || s.contains("AM")) {
			s = s.substring(0, s.length() - 2) + " " + s.substring(s.length() - 2);
		}

		DateFormat from = new SimpleDateFormat("hh:mm:ss aa");

		DateFormat to = new SimpleDateFormat("HH:mm:ss");

		Date result = from.parse(s);

		return to.format(result);

	}

	@Test
	void timeConversionTest() throws ParseException {
		Assertions.assertEquals("19:05:45", timeConversion("07:05:45PM"));
	}
}
