package ikm.test01;

import java.util.*;
class TokenCount{
public static void main(String[] args) {
StringTokenizer stk1 = new StringTokenizer(",a,b",",");
StringTokenizer stk2 = new StringTokenizer(",,ab",",");
StringTokenizer stk3 = new StringTokenizer("ab,,,","b");
StringTokenizer stk4 = new StringTokenizer(",ab,,a",",");
System.out.println(stk1.countTokens()+" "+stk2.countTokens()+" "+stk3.countTokens()+" "+stk4.countTokens());
}
}
