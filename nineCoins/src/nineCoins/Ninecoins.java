package nineCoins;
import java.util.Scanner;

public class Ninecoins {



		public static void main(String[] args) {
			 
			 // Use binary number and bitwise operator to shift the bit to the right and
			 // use masking to extract the last digit
			 
			
			 
			  Scanner input = new Scanner(System.in);
			  System.out.print("Enter a number between 0 and 511: ");
			  short n = input.nextShort();
			  int intArray[][] = new int[3][3];
			 
			  short mask = 0b1; // to extract the last bit after shifting
			  for (int i = 0; i < 9; i++) {
			 // 
			   short bit = (short) (n & mask);
			   // extracting last bit i.e the remainder of division by 2
			   intArray[2-i / 3][2-i % 3] = bit;
			   n = (byte) (n >> 1); // Shifting right is dividing by 2. The last
			         // bit is the remainder of the next shift.
			 
			  }
			 
			  //displayArray(intArray);
			 
			 }
			 
			// custom method has to be added to display the arrays
			 
			

		}


