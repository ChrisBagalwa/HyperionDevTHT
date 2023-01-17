/**
 * NumberNames class contains arrays that store special names, tens names, and digit names
 * It also contains methods to get the name of a number and its special name
 *
 * @author Chris Bagalwa
 * 16/01/2023
 * @version 1.0
 */

public class NumberNames {
    /**
     * specialNames array stores the special names of the number, such as "thousand", "million", etc.
     */
    private static final String[] specialNames = {
            "", //0
            " thousand", //1
            " million", //2
            " billion", //3
            " trillion", //4
            " quadrillion", //5
            " quintillion" //6
    };

    /**
     * tensNames array stores the names of the tens digits, such as "ten", "twenty", etc.
     */
    private static final String[] tensNames = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };

    /**
     * numNames array stores the names of the digits, such as "one", "two", etc.
     */
    private static final String[] numNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    /**
     * getName() method returns the full name of the given number.
     * @param number the number to get the name of
     * @return the name of the number
     */
    public String getName(int number) {
        if (number < 20) {
            // numbers from 0-19 have unique names
            return numNames[number];
        } else if (number < 100) {
            // for numbers between 20 and 99, the name is the tens name plus the ones name
            return tensNames[number / 10] + numNames[number % 10];
        } else {
            // for numbers 100 and above, the name is the ones name for the hundreds place plus "hundred"
            // plus the name for the remaining number
            return numNames[number / 100] + " hundred" + getName(number % 100);
        }
    }
    /**
     * getSpecialName() method returns the special name for the given place (thousand, million, etc.)
     * @param place the place to get the special name for (0-6)
     * @return the special name for the given place
     */
    public String getSpecialName(int place) {
        return specialNames[place];
    }
}
