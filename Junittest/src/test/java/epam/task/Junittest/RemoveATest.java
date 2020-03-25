package epam.task.Junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveATest {
	
	/* 
	 "ABCD"=>"BCD"
	 "AACD"=>"CD"
	 "BACD"=>"BCD"
	 "BBAA"=>"BBAA"
	 "AABAA"=>"BAA"
	 */
	
	@Test
	void testRemove1() {
		RemoveA RemoveA=new RemoveA();
		String actual=RemoveA.remove("ABCD");
		assertEquals("BCD",actual);
	}
	
	@Test
	void testRemove2() {
		RemoveA RemoveA=new RemoveA();
		String actual=RemoveA.remove("AACD");
		assertEquals("CD",actual);
	}
	
	@Test
	void testRemove3() {
		RemoveA RemoveA=new RemoveA();
		String actual=RemoveA.remove("BACD");
		assertEquals("BCD",actual);
	}
	
	@Test
	void testRemove4() {
		RemoveA RemoveA=new RemoveA();
		String actual=RemoveA.remove("BBAA");
		assertEquals("BBAA",actual);
	}
	
	@Test
	void testRemove5() {
		RemoveA RemoveA=new RemoveA();
		String actual=RemoveA.remove("AABAA");
		assertEquals("BAA",actual);
	}

}
