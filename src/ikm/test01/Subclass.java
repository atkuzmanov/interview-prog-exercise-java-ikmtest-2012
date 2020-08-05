package ikm.test01;

class Superclass {
Superclass() {
this(0);
System.out.println("1");
}
Superclass(int x) {
System.out.println("2"+x);
}
}
public class Subclass extends Superclass {
Subclass(int x) {
System.out.println("3"+x);
}
Subclass(int x, int y) {
this(x);
System.out.println("4"+x+y);
}
public static void main(String[] args) {
new Subclass(2, 3);
}
}