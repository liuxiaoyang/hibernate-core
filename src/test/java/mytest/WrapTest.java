package mytest;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

import org.hibernate.type.descriptor.WrapperOptions;

public class WrapTest {

	private final char characterValueTrue;
	private final char characterValueTrueLC;

	public WrapTest() {
		this.characterValueTrue = 'Y';
		this.characterValueTrueLC = Character
				.toUpperCase(this.characterValueTrue);
	}

	public static void main(String[] args) {
		WrapTest tempTest = new WrapTest();
		String value = "no";
		Boolean wrapValue = tempTest.wrap(value, null);
		System.out.println(wrapValue);
		int value2=0;
		wrapValue = tempTest.wrap(value2, null);
		System.out.println(wrapValue);
	}

	public <V> Boolean wrap(V value, WrapperOptions options) {
		if (value == null) {
			return null;
		}
		if (Boolean.class.isInstance(value)) {
			return (Boolean) value;
		}
		if (Number.class.isInstance(value)) {
			final int intValue = ((Number) value).intValue();
			return intValue == 0 ? FALSE : TRUE;
		}
		if (Character.class.isInstance(value)) {
			return isTrue(((Character) value).charValue()) ? TRUE : FALSE;
		}
		if (String.class.isInstance(value)) {
			return isTrue(((String) value).charAt(0)) ? TRUE : FALSE;
		}
		return null;
	}
	
	private boolean isTrue(char charValue) {
		return charValue == characterValueTrue
				|| charValue == characterValueTrueLC;
	}
}
