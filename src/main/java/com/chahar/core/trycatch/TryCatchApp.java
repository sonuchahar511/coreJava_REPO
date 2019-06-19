package com.chahar.core.trycatch;

public class TryCatchApp {

	public static void main(String[] args) {
		int result = test();
		System.out.println(result);
	}

	private static int test() {
		int result = 100;

		try {
			System.out.println("try");
			result = 200;
			//return result;
			int r = result/ 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException" + e);
		} catch (Exception e) {
			System.out.println("Exception  e ==> "+e);
			System.out.println("Exception e.getMessage() ==> "+e.getMessage());
			System.out.println("Exception e.getLocalizedMessage() ==> "+e.getLocalizedMessage());
			System.out.println("Exception e.getStackTrace() ==> "+e.getStackTrace()[0] +" ----- "+ e.getStackTrace()[1]);
			System.out.println("Exception e.getCause() ==> "+e.getCause());
			System.out.println("Exception e.getSuppressed() ==> "+e.getSuppressed());
			System.out.println("Exception e.getClass()() ==> "+e.getClass());
		} finally {
			System.out.println("in finally");
		}

		return result;
	}

}
