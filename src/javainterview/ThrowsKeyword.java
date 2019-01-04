package javainterview;

public class ThrowsKeyword {
	public static void main(String a[]) {
		try {
			ThrowsKeyword met = new ThrowsKeyword();
			System.out.println("length of JUNK is " + met.getStringSize("JUNK"));
			System.out.println("length of WRONG is " + met.getStringSize("WRONG"));
			System.out.println("length of null string is " + met.getStringSize(null));
		} catch (Throwable ex) {
			System.out.println("Exception message: " + ex.getMessage());
		}
	}

	public int getStringSize(String str) throws Throwable {
		if (str == null) {
			throw new Exception("String input is null");
		}
		return str.length();
	}
}
