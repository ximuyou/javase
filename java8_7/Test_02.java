package java8_7;

public class Test_02 {
	public static void main(String[] args) {
		thing t = new thing();
		t.putmessiage(new worker());
		t.putmessiage(new yemao());
		/**
		 * thing t=new thing();
		 * 
		 * t.putmessiage(w);
		 * 
		 * t.putmessiage(y);
		 */
	}
	/**
	 * static void putmessiage(per p){ p.doday; p.donight;
	 * 
	 * }
	 */

}

class thing {
	void putmessiage(per p) {
		p.doday();
		p.donight();
	}

}

interface per {
	void doday();

	void donight();
}

class worker implements per {

	@Override
	public void doday() {
		System.out.println("do hard work this time");
	}

	@Override
	public void donight() {
		System.out.println("have a rest in this time");

	}

}

class yemao implements per {

	@Override
	public void doday() {
		System.out.println("set in bed");

	}

	@Override
	public void donight() {
		System.out.println("very nice");

	}

}
