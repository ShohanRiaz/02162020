package logicalStatement;

//if else condition is related to boolean

public class CompareNumber02 {
	public static void main(String[] args) {
		int val1 = 45;
		int val2 = 35;

		if (val1 < val2) {
			System.out.println(val1 + " is shorter than " + val2);
		} else if (val1 > val2) { //when you put condition then you have to use "else if"
			System.out.println(val1 + " is greater than " + val2);

		}
	}

}