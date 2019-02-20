package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import shoping_cart.cart;

public class cartTest {
	private cart c;
	@Before
	public void setUp() throws Exception {
		c=new cart();
	}

	@Test
	public void case1Test() {
		assertEquals(0,c.get_list().size());
	}

	@Test
	public void case2Test() {
		
		c.set_list("javabook", 127,1);
		assertEquals(1,c.get_list().size());
		
		assertEquals(127,c.total());
		
	}

	@Test
	public void case3Test() {
		c.set_list("javabook", 127,1);
		
		c.set_list("webdesign", 100,1);
		assertEquals(2,c.get_list().size());
		assertEquals(227,c.total());
	}

}
