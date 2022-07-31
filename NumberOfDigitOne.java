import java.util.Scanner;

public class NumberOfDigitOne {
	 
	 public static int countDigitOne(int n) {
		 int occurences = 0;
		 int column = 1;
		 int lastDig = 0;
		 while(n != 0) {
			 int bins = n / 10;
			 occurences += bins * column;
			 int currentDig = n % 10;
			 if(currentDig > 1) {
				 occurences += column;
			 } else if(currentDig == 1) {
				 occurences += lastDig+1;
			 }
			 lastDig = (currentDig*column)+lastDig;
			 column *= 10;
			 n = n / 10;
		 }
		 return occurences;
	 }
	 
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter a number: ");
		 int n = in.nextInt();
		 System.out.println(countDigitOne(n));
		 in.close();
	 }
}
