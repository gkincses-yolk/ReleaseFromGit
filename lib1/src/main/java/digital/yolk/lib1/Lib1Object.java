package digital.yolk.lib1;

import lombok.Data;

import java.io.IOException;
import java.util.Properties;

@Data
public class Lib1Object {
	private final Properties p = new Properties();

	private final String groupId;
	private final String artifactId;
	private final String version;

	public Lib1Object() throws IOException {
		p.load(this.getClass().getClassLoader().getResourceAsStream("application.properties"));
		groupId    = p.getProperty("app.groupId");
		artifactId = p.getProperty("app.artifactId");
		version    = p.getProperty("app.version");
	}
	public String getValue() {
		return artifactId + ":" + version;
	}
}
