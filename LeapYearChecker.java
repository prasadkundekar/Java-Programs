public class LeapYearChecker {
    public static void main(String[] args) {
        int year = 2005; // Replace with the desired year
        boolean isLeapYear = checkLeapYear(year);
        if (isLeapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}   