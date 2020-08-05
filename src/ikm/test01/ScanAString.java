package ikm.test01;

import java.util.Scanner;
class ScanAString {
public static void main(String[] args) {
Scanner aScanner = new Scanner("1 thousand dollars true");
int integerCount=0, stringCount = 0;
Integer nextInteger = null;
String nextString = null;
while (aScanner.hasNext()) {
if (aScanner.hasNextInt()) {
nextInteger = aScanner.nextInt();
integerCount++; 
} 
else {
nextString = aScanner.next();
stringCount++;
} 
}
System.out.println(String.format("%s %s",integerCount, stringCount));
}
}