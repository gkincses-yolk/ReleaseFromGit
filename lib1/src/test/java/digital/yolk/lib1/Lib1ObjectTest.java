package digital.yolk.lib1;

import org.junit.*;

import java.io.IOException;

import static org.junit.Assert.*;

public class Lib1ObjectTest {

	Lib1Object o = new Lib1Object();

	public Lib1ObjectTest() throws IOException {
	}

	@Test
	public void testGetValue() {
		assertEquals(o.getArtifactId() + ":" + o.getVersion(), o.getValue());
	}
}
