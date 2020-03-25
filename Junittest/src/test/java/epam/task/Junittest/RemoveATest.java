package epam.task.Junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveATest {
	
	/* 
	 "ABCD"=>"BCD"
	 "AACD"=>"CD"
	 "BACD"=>"BCD"
	 "BBAA"=>"BBAA"
	 "AABAA"=>"BAA"
	 */
	RemoveA RemoveAobj;
	@BeforeEach
	void Create()
	{
		RemoveAobj=new RemoveA();
	}
	@Test
	void testRemove1() {
		String actual=RemoveAobj.remove("ABCD");
		assertEquals("BCD",actual);
	}
	
	@Test
	void testRemove2() {
		String actual=RemoveAobj.remove("AACD");
		assertEquals("CD",actual);
	}
	
	@Test
	void testRemove3() {
		String actual=RemoveAobj.remove("BACD");
		assertEquals("BCD",actual);
	}
	
	@Test
	void testRemove4() {
		String actual=RemoveAobj.remove("BBAA");
		assertEquals("BBAA",actual);
	}
	
	@Test
	void testRemove5() {
		String actual=RemoveAobj.remove("AABAA");
		assertEquals("BAA",actual);
	}

}
