package ma223zf_assign2;

public class Reverse {

	public static void main(String[] args) {
		char[] text = { '!', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ', 's', 'i', 'h', 'T' };
		for (int i = 0; i < text.length; i++) { // print array//
			System.out.print(text[i]);
		}
		System.out.println(); // new empty line//
		int i = 0;
		int j = text.length;
		while (i < j) { // swap array elements//
			char temp = text[j - 1];
			text[j - 1] = text[i];
			text[i] = temp;
			i++;
			j--;
		}
		for (char ch : text) // print the swapped array//
			System.out.print(ch);
	}
}
