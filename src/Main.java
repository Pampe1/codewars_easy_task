public class Main {
  public static int[] twoSum(int[] nums, int target) {
    for(int i = 0; i < nums.length; i++) {
      for(int j = i + 1; j < nums.length; j++) {
        if(nums[i] + nums[j] == target) {
          int[] array = {nums[i], nums[j]};
          return array;
        }
      }
    }
    return null;
  }

  public static void main(String[] args) {

    int[] nums = {3, 2, 4};
    int[] array = twoSum(nums, 6);
    //Output
    System.out.print("[");
    int counter = array.length - 1;
    for(int a : array) {
      System.out.print(a);
      if(counter > 0) {
        System.out.print(", ");
      }
      counter--;
    }
    System.out.print("]");
  }
}



//To Do:

//1.
//nums = [2, 7, 11, 15], target = 9
//Ответ: [0, 1]   (потому что nums[0] + nums[1] = 2 + 7 = 9)

//2.
//nums = [3, 2, 4], target = 6
//Ответ: [1, 2]   (потому что nums[1] + nums[2] = 2 + 4 = 6)