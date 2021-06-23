package edu.cnm.deepdive;

/*

Given an array of ints, return true if the array contains no 1's and no 3's.

lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 */

public class CodingBatLuckyThirteen {

  private static int[] one = {0, 2, 4};
  private static int[] two = {1, 2, 3};
  private static int[] three = {1, 2, 4};

  public static void main(String[] args) {
    System.out.println("Given the array [0, 2, 4], the outcome will be " + lucky13(one) + ".");
    System.out.println("Given the array [1, 2, 3], the outcome will be " + lucky13(two) + ".");
    System.out.println("Given the array [1, 2, 4], the outcome will be " + lucky13(three) + ".");
  }

  public static boolean lucky13(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      if (nums [i] == 1 || nums[i] == 3) {
        return false;
      }
    }
    return true;
  }

}
