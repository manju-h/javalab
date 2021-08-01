package general;

/*
 * Write an interface with default and static method?
 * Java 8 introduced default and static methods in interfaces. This has bridged the gap between interfaces and abstract classes.
 */
public interface Interface1 {

	// regular abstract method
	void method1(String str);

	default void log(String str) {
		System.out.println("I1 logging::" + str);
	}

	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}
