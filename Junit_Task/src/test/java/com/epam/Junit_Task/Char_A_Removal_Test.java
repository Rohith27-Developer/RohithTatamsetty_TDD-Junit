package com.epam.Junit_Task;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Char_A_Removal_Test {
	/*TODO list for my feature
	 * 1.  ABCD   :  BCD
	 * 2.  AACD   :  CD
	 * 3.  BACD   :  BCD
	 * 4.  BBAA   :  BBAA
	 * 5.  AABAA  :  BAA
	 * 6.  A      :  ""
	 * 7.  " "    :  " "
	 * 8.  AA	  :	 ""
	 * 9.  AAABC  :  ABC
	 * 10. AAAAAA :  AAAA
	 * 11. ""	  :  ""
	 * 12.CDEF	  :  CDEF	
	 */
	Char_A_Removal remove_A;
	@BeforeEach
	void setup()
	{
		remove_A=new Char_A_Removal();
	}
	@Test
	void test1() {
		assertEquals("BCD", remove_A.remove_A("ABCD"));		
	}
	@Test
	void test2() {
		assertEquals("CD",remove_A.remove_A("AACD"));		
	}
	@Test
	void test3() {
		assertEquals("BCD",remove_A.remove_A("BACD"));		
	}
	@Test
	void test4() {
		assertEquals("BBAA",remove_A.remove_A("BBAA"));		
	}

	@Test
	void test5() {
		assertEquals("BAA",remove_A.remove_A("AABAA"));		
	}
	@Test
	void test6() {
		assertEquals("",remove_A.remove_A("A"));		
	}
	@Test
	void test7() {
		assertEquals(" ",remove_A.remove_A(" "));		
	}
	@Test
	void test8() {
		assertEquals("",remove_A.remove_A("AA"));		
	}
	@Test
	void test9() {
		assertEquals("ABC",remove_A.remove_A("AAABC"));		
	}
	@Test
	void test10() {
		assertEquals("AAAA",remove_A.remove_A("AAAAAA"));		
	}
	@Test
	void test11() {
		assertEquals("",remove_A.remove_A(""));		
	}
	@Test
	void test12() {
		assertEquals("CDEF",remove_A.remove_A("CDEF"));		
	}
}
