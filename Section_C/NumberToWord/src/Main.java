/**
 * Main class runs test cases for the NumberToWord class's convert method.
 * It creates an instance of NumberToWord class and calls the convert method with different numbers
 *
 * @author Chris Bagalwa
 * 16/01/2023
 * @version 1.0
 */
class Main{
    /**
     * The main method runs test cases for the convert method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of the NumberToWord class
        NumberToWord obj = new NumberToWord();
        // Test the convert method with different numbers
        System.out.println("*** " + obj.convert(123456789));
        System.out.println("*** " + obj.convert(-55));
        System.out.println("*** " + obj.convert(90376000010012L));
    }
}