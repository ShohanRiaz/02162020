package logicalStatement;

//if else condition is related to boolean

public class CompareNumber04 {
	public static void main(String[] args) {
		int val1 = 45;
		int val2 = 45;

		if (val1 < val2) {
			System.out.println(val1 + " is shorter than " + val2);
		} else if (val1 > val2) { // if you put condition then you have to use "else if"
			System.out.println(val1 + " is greater than " + val2);
		} else if (val1 != val2) { // != not equal to
			System.out.println(val1+ " is not equal to "+val2);
		} else if (val1 == val2) { // this is called == equality operator / == logical or operator
			System.out.println(val1 + " is equal to " + val2);
		}
	}
}

