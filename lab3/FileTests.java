import java.util.Arrays;
interface IntChanger {
  int change(int n);
}
class Methods {
  // Changes nums so that each index holds the changed
  // version of the numbers according to the given IntChanger
  static void changeAll(int[] nums, IntChanger ic) {
    for(int i = 0; i < nums.length; i += 1) {
      nums[i] = ic.change(nums[i]);
    }
  }
}
class Test {
  public static void main(String[] args) {
    int[] ns = { 5, 6, 7 };
    //Methods.changeAll(ns, _____BLANK2____);
    System.out.println(Arrays.toString(ns));
  }
}