package ikm.test01;

public class OperatorDemo {
	public static void main(String[] args) {
	new OperatorDemo().method();
	}
	public void method(){
	int x=3;
	boolean b1=true;
	boolean b2=false;
	if ((b1 | b2)||(x++>4))
	System.out.print(" x1: "+x++);
	if((!b1 & b2)&&(++x<4))
	System.out.print(" x2: "+x);
	}
	}
