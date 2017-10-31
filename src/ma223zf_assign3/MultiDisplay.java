package ma223zf_assign3;

public class MultiDisplay {
	private int displayCount;
	private String displayMessage;

	public MultiDisplay() { /*constructor*/

	}

	public void setDisplayMessage(String message) /*update the message*/

	{
		displayMessage = message;

	}

	public void setDisplayCount(int count) { /*update count*/
		displayCount = count;
	}

	public void display() {
		for (int i = 0; i < displayCount; i++) {
			System.out.println(displayMessage);
		}
	}

	public void display(String message, int count) {
		displayMessage = message;
		displayCount = count;

		for (int i = 0; i < count; i++) {
			System.out.print(message);
		}
	}

	public String getDisplayMessage() { 
		return displayMessage;
	}
}
