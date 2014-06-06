package com.test.webapp.manager;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JunitTest {
	private SimpleDateFormat simpleDateFormat;
	private String date;
	private String dateformat;
	private String expectedDate;

	public JunitTest(String date, String dateformat, String expectedDate) {
		super();
		this.date = date;
		this.dateformat = dateformat;
		this.expectedDate = expectedDate;
	}

	@Parameters
	public static Collection<String[]> getParamters() {
		String[][] object = {
				{ "2014-06-05 00:30:59", "yyyyMMdd", "20140605" },
				{ "2014-06-05 00:30:59", "yyyy年MM月dd日", "2014年06月05日" },
				{ "2014-06-05 00:30:59", "HH时mm分ss秒", "00时30分59秒" } };
		return Arrays.asList(object);
	}

	@Test
	public void testSimpleDateFormat() throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("date:" + this.date);
		System.out.println("dateformat:" + this.dateformat);
		System.out.println("expectedDate:" + this.expectedDate);
		Date d = df.parse(this.date);
		simpleDateFormat = new SimpleDateFormat(this.dateformat);
		String result = simpleDateFormat.format(d);
		System.out.println(result);
		assertEquals(this.expectedDate, result);
	}
}
