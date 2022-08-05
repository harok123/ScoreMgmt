import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void testCalc() {
		Student ha[] = {new Student("17", "최하록", 80, 90, 100, 70)};
		Calc calc = new Calc(ha);
		calc.calc(1);
		assertEquals(80+90+100+70, ha[0].getTot());
	}

}
