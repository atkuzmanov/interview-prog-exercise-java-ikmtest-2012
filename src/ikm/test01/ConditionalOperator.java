package ikm.test01;

public class ConditionalOperator{
	static String method(boolean b) {
	return b?"True":"False";
	}
	public static void main(String [] args) {
	boolean b = (false?false:true)?false:true;
	System.out.println(method(b));
	}
	}