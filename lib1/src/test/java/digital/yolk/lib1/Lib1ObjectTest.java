package digital.yolk.lib1;

import org.junit.jupiter.api.*;

public class Lib1ObjectTest {

	Lib1Object lib1Object = new Lib1Object();

	@Test
	public void testGetValue() {
		Assertions.assertEquals("lib1-1.0-SNAPSHOT", lib1Object.getValue());
	}
}
