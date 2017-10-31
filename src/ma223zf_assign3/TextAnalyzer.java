package ma223zf_assign3;

public class TextAnalyzer {

	String text = "";

	public TextAnalyzer(String tex) {/*construct*/
		text = tex;
	}

	public int charCount() { /*calculate number of char in the text*/
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			count++;
		}
		return count;
	}

	public int upperCaseCount() { /*calculate number of upper case char in the text*/
		int upperCount = 0;
		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i))) {
				upperCount++;
			}
		}
		return upperCount;
	}

	public int whitespaceCount() { /*calculate number of white space  in the text*/
		int whiteSpaceCount = 0;
		for (int i = 0; i < text.length(); i++) {
			if (Character.isWhitespace(text.charAt(i))) {
				whiteSpaceCount++;

			}
		}
		return whiteSpaceCount;
	}

	public int digitCount() { /*calculate number of digits in the text*/
		int digitCount = 0;
		for (int i = 0; i < text.length(); i++) {
			if (Character.isDigit(text.charAt(i))) {
				digitCount++;
			}
		}

		return digitCount;
	}

	public boolean containsChar(char ch) { /*check if the text contains a specific char*/
		for (int i = 0; i < text.length(); i++) {
			if (ch == text.charAt(i)) {
				return true;

			}

		}
		return false;
	}

	public boolean containsString(String sub) { /*check if the text contains a specific string*/
		if (text.contains(sub)) {
			return true;
		}
		return false;
	}
}
