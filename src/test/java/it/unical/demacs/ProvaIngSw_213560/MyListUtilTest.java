package it.unical.demacs.ProvaIngSw_213560;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {

	
	public MyListUtil myListUtil;
	
	@Before
	public void beforeTest() {
		System.out.println("Before Test:");
		DateTime t=new DateTime(DateTimeZone.UTC);
		System.out.println(t.now());
		myListUtil=new MyListUtil();
	}
	
	@After
	public void afterTest() {
		System.out.println("After Test:");
		DateTime t=new DateTime(DateTimeZone.UTC);
		System.out.println(t.now());
	}
	
	@Test
	public void order0Works() {
		List<Integer> m=new ArrayList<Integer>();
		m.add(2);
		m.add(3);
		m.add(4);
		m.add(1);
		
		List<Integer> expectedList=new ArrayList<Integer>();
		expectedList.add(1);
		expectedList.add(2);
		expectedList.add(3);
		expectedList.add(4);
		
		myListUtil.sort(m, 0);
		
		for(int i=0;i<m.size();i++)
			assertEquals(m.get(i),expectedList.get(i));
	}
	
	@Test
	public void order1Works() {
		List<Integer> m=new ArrayList<Integer>();
		m.add(2);
		m.add(3);
		m.add(4);
		m.add(1);
		
		List<Integer> expectedList=new ArrayList<Integer>();
		expectedList.add(4);
		expectedList.add(3);
		expectedList.add(2);
		expectedList.add(1);
		
		myListUtil.sort(m, 1);
		
		for(int i=0;i<m.size();i++)
			assertEquals(m.get(i),expectedList.get(i));
	}

}
