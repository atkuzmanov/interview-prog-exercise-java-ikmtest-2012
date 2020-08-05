package ikm.test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {
public static void main(String[] args) {
ArrayList<String> originalList = new ArrayList<String>();
originalList.add("Two");
originalList.add("One");
	originalList.add("Three");
	originalList.add("Four");
	Collections.sort(originalList, new StringSort());
	System.out.println(originalList);
	}
	}
	class StringSort implements Comparator<String> {
	public int compare(String arg0, String arg1) {
	return arg0.charAt(1) - arg1.charAt(1);
	}
	}
