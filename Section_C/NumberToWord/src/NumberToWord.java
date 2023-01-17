/**
 * NumberToWord class converts a number to its word representation
 * It uses the NumberNames class to get the names of the digits and special names
 *
 * @author Chris Bagalwa
 * 16/01/2023
 * @version 1.0
 */

class NumberToWord {
    // Instance variable to access the NumberNames class
    private NumberNames numberNames;

    /**
     * Constructor for the NumberToWord class
     * Initializes the NumberNames object
     */
    public NumberToWord() {
        // Initialize the NumberNames object
        this.numberNames = new NumberNames();
    }

    /**
     * convert() method converts the given number to words
     * @param number the number to convert to words
     * @return the number as words
     */
    public String convert(long number) {
        // If the number is 0, return "Zero"
        if (number == 0) {
            return "zero";
        }

        String prefix = "";

        // If the number is negative, add "Negative" before the number
        if (number < 0) {
            number = -number;
            prefix = "negative";
        }

        String current = "";
        int place = 0;
        // Iterate until the number is greater than 0
        do {
            long n = number % 1000;
            if (n != 0) {
                // Get the part of the number that is less than 1000
                String s = convertLessThanOneThousand(n);
                // Add the part of the number and the corresponding special name to the current string
                current = s + numberNames.getSpecialName(place) + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);
        // Return the final string after trimming any extra spaces
        return (prefix + current).trim();
    }
    /**
     * convertLessThanOneThousand() method converts the given number to words when the number is less than 1000
     * @param number the number to convert to words
     * @return the number as words
     */
    private String convertLessThanOneThousand(long number) {
        return numberNames.getName((int) number);
    }
}

