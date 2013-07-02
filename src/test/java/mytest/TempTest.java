package mytest;

public class TempTest {

	public static void main(String[] args) {
		String resource = "/hibernate.cfg.xml";
		String stripped = resource.startsWith("/") ? resource.substring(1)
				: resource;
		System.out.println(stripped);
	}
}
