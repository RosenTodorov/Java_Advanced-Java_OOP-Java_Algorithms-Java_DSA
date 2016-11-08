import java.text.MessageFormat;
import java.util.Scanner;

public class CompareArrays {
	
	/* Write a program that reads two integer arrays from the console and 
	 * compares them element by element. */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Write("Please enter the lenght of the first array: ");
		int lengthFirstArray  = scanner.nextInt();
		Write("Please enter the lenght of the second array: ");
		int lengthSecondArray  = scanner.nextInt();
		
		int[] firstArray = new int[lengthFirstArray];
		int[] secondArray = new int[lengthSecondArray];
		
		for (int i = 0; i < lengthFirstArray; i++) {
			Write("Plese enter the elements of the first array: ");
			int elementFirstArray = scanner.nextInt();
			firstArray[i] = elementFirstArray;
		}
		
		for (int i = 0; i < lengthSecondArray; i++) {
			Write("Plese enter the elements of the second array: ");
			int elementSecondArray = scanner.nextInt();
			secondArray[i] = elementSecondArray;		
		}
		
		boolean isEqual = true;
		
		if (lengthFirstArray == lengthSecondArray) {
			for (int i = 0; i < lengthFirstArray; i++) {
				if (firstArray[i] != secondArray[i]) {
					isEqual = false;
					break;									
				}
			}			
		}
		else {
			isEqual = false;
		}
		writeline("The two arrays are equal: {0}", isEqual);			
	}
	
	public static void Write(String format, Object... obj) {
		MessageFormat form = new MessageFormat(format);
		System.out.printf(form.format(obj));
	}
	
	public static void Write(Object obj) {
		System.out.print(obj);
	}
	
	public static void writeline(String format, Object... obj) {
		MessageFormat form = new MessageFormat(format);
		System.out.println(form.format(obj));
	}
}
