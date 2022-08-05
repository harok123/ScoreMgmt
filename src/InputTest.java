import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class InputTest {
	private Student ar[];
	
	@Before
	public void init() {
		ar = new Student[100];
	}
	@Ignore @Test
	public void test() {
		assertNotNull(ar);
	}
	
	@Test
	public void testInput() {
		Student ar[] = new Student[100];
		Input input = new Input(ar);
//		int count = input.input();
		//assertEquals(2, count);
		assertEquals("하록",ar[0].getName());	//(기대값, 설정값)
	}

}
