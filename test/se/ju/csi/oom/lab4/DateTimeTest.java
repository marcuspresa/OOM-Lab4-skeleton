package se.ju.csi.oom.lab4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class DateTimeTest {

	@Before
	public void setUp() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		DateTime datetime = new DateTime(2018, 12 ,1 ,1 ,1 , 1);			
		DateTime datetime2 = new DateTime(datetime.toString());
		assertEquals(datetime.toString(), datetime2.toString());
	}


}
