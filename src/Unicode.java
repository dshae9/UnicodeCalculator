import java.util.Scanner;


public class Unicode {
public static void main(String[] args) {
	
	Scanner scnr = new Scanner(System.in);
	System.out.print("Enter first string here: ");
	String s1 = scnr.nextLine();
	System.out.print("Enter second string here: ");
	String s2 = scnr.nextLine();
	System.out.println();
	
	int sum1 = 0 , sum2 = 0, c;
	for(int i = 0; i < s1.length(); i++) {
		c = (int)s1.charAt(i);
		System.out.println(s1.charAt(i) + " : " + c);
		sum1 += c;
	}
	System.out.println();
	for(int i = 0; i < s2.length(); i++) {
		c = (int)s2.charAt(i);
		System.out.println(s2.charAt(i) + " : " + c);
		sum2 += c;
	}
	System.out.println();
	int abs = Math.abs(sum1 - sum2);
	System.out.print("Sum of first string : " + sum1);
	System.out.print("Sum of second string : " + sum2);
	System.out.print("Absolute difference is : " + abs);

}
}
