package ma223zf_assign3;

public class SweID {

	public static String getFirstPart(String id) { // return the first part that
													// contains 6 digits//
		return id.substring(0, 6);
	}

	public static String getSecondPart(String id) { // return the second part
													// that contains 4 digits//
		return id.substring(7, id.length());
	}

	public static boolean isFemale(String id) { // check if the id is for a
												// female//
		String s = "" + id.charAt(id.length() - 1);
		return Integer.parseInt(s) % 2 == 0;
	}

	public static boolean isMale(String id) { // check if the id is for a male//
		String s = "" + id.charAt(id.length() - 1);
		return Integer.parseInt(s) % 2 == 1;
	}

	public static boolean areEqual(String id, String corespondID) { // check two
																	// id if
																	// they are
																	// corresponded//
		if (id.equals(corespondID)) {
			return true;
		}
		return false;
	}

	public static boolean isCorrect(String id) { // check if the id is correct//
		String sweId = getFirstPart(id) + getSecondPart(id);
		int[] arrayId = new int[sweId.length()];
		for (int i = 0; i < sweId.length(); i++) {
			String sId = "" + sweId.charAt(i);
			int convert = Integer.parseInt(sId);
			arrayId[i] = convert;
		}

		if (sweId.length() != 10) {
			return false;
		}
		for (int i = 0; i < arrayId.length; i++) { // check if digits has a
													// negative value//
			if (arrayId[i] < 0) {
				return false;
			}
		}
		if (arrayId[2] == 0 && arrayId[3] > 9) { // check MM format the max
													// value for second digit is
													// 9//
			return false;
		}
		if (arrayId[2] > 1) { // check MM format the max value for the first
								// digit is 1//
			return false;
		}
		if (arrayId[2] == 1 && arrayId[3] > 2) { // check MM format if the first
													// digit is 1 then the max
													// value for the second one
													// is 2//
			return false;
		}
		if (arrayId[4] > 3) { // check DD format the first digit max value is
								// 3//

			return false;
		}
		if (arrayId[4] < 3 && arrayId[5] > 9) { // check DD format the max value
												// for second digit is 9//
			return false;
		}
		if (arrayId[4] == 3 && arrayId[5] > 1) { // check DD format the month
													// has 31 days at most//
			return false;
		}

		int sum = 0;
		for (int i = 0; i <= arrayId.length - 2; i += 2) { // sum equation for
															// odd digits//
			int temp = ((arrayId[i] * 2) % 10) + ((arrayId[i] * 2) / 10);
			sum = sum + temp;

		}

		for (int i = 1; i <= arrayId.length - 2; i += 2) { // sum equation for
															// even digits
															// excluding the
															// last digit//
			sum = sum + arrayId[i]; // add the two sums together//
		}

		int checkSum = 10 - (sum % 10); // checksum procedure//
		if (checkSum == 10) {
			checkSum = checkSum % 10;
		}
		if (arrayId[arrayId.length - 1] == checkSum) { // if last digit equal
														// checksum the the id
														// is correct//S
			return true;
		} else {
			return false;
		}

	}
}
