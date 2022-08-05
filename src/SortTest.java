import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

public class SortTest {

	@Test
	public void testBs() {
		Student ar[] = new Student[] {
			new Student(), new Student()
		};
		ar[0].setName("종학");
		ar[0].setTot(360);
		ar[1].setName("하록");
		ar[1].setTot(370);
		Sort sort = new Sort(ar, ar.length);
		sort.bs();
		assertEquals("하록", ar[0].getName());
	}

	@Ignore @Test
	public void testSs() {
		
	}

}
