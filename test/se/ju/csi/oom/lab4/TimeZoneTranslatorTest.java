package se.ju.csi.oom.lab4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;


public class TimeZoneTranslatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testShiftTimeZone() {
		DateTime datetime = new DateTime(2018,10,2, 15, 2, 2);
		datetime = TimeZoneTranslator.shiftTimeZone(datetime, 1, 2);
		assertEquals(new String("2018-10-02 16:02:02"),datetime.toString());
		
	
		
	}

	@Test
	public void testShiftEventTimeZone() {
		DateTime datetimestart = new DateTime(2018,9,2,15,0,0);
		DateTime datetimeend = new DateTime(2018,10,2,15,0,0);
		Person Ragge = new Person("Ragge");
		Place location = new Place("Huddinge", 1.0, 1.0, 1.0);
		Event party = new Event("Party",datetimestart, datetimeend,new HashSet<>(Arrays.asList(Ragge)), location );
		party = TimeZoneTranslator.shiftEventTimeZone(party, TimeZone.MOSCOW, TimeZone.BUENOS_AIRES);
		assertEquals(new String("2018-09-02 09:00:00"), party.getStartDate().toString());
		assertEquals(new String("2018-10-02 09:00:00"), party.getEndDate().toString());
		
		
	}

}
