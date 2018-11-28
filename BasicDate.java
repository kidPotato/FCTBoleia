
public class BasicDate {

	private static final int NUM_FIELDS = 3;

	private int[] rawDate;

	/***
	 * Builds a new raw date object. 
	 * @param date -- a string of the form N1-N2-N3, 
	 * where N1,N2,N3 are positive numbers representable as integers.
	 */
	public BasicDate(String date) {
		String[] split = date.split("-");
		rawDate = new int[NUM_FIELDS];

		for (int i = 0; i < split.length; i++) {
			rawDate[i] = Integer.parseInt(split[i].trim());
		}

	}

	// TODO
	public boolean isValid() {

		return false;
	}

	/**
	 * Returns the year field of this date, assuming the string used
	 * in the constructor was a valid date (i.e., isValid() ).
	 * 
	 */
	public int getYear() {
		return rawDate[2];
	}
	
	/**
	 * Returns the day field of this date, assuming the string used
	 * in the constructor was a valid date (i.e., isValid() ).
	 *  
	 */
	public int getDay() {
		return rawDate[0];
	}
	
	/**
	 * Returns the month field of this date, assuming the string used
	 * in the constructor was a valid date (i.e., isValid() ).
	 * 
	 */
	public int getMonth() {
		return rawDate[1];
	}
	


}
