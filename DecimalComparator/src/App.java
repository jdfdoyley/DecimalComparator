/**
 * Author: Jason D. F. D'Oyley
 * Date: Dec 29, 2022
 * Exercise Name: DecimalComparator
 */

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // true
    System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.1765)); // false
    System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); // true
    System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); // false
  }

  /**
   * @param a
   * @param b
   * @return boolean
   */
  public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
    int temp;

    temp = (int) (a * 1000);
    a = (double) temp / 1000;

    temp = (int) (b * 1000);
    b = (double) temp / 1000;

    if (a == b) {
      return true;
    } else {
      return false;
    }
  }
}