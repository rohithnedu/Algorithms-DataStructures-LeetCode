/*Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.


You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.

*/


public static int findDuplicate(int[] nums) {
  
    int low = 1; //[low, high)
    int high = nums.length;
    while(low < high){
      int mid = low + (high - low) / 2;
      int leftCount = 0;
      int rightCount = 0;
      int midCount = 0;
      for(int i : nums){
        if(i == mid){
          ++midCount;
        }else if(i >= low && i < mid){ //[low, mid]
          ++leftCount;
        }else if(i > mid && i < high){ //(mid, high)
          ++rightCount;
        }
      }
      if(midCount > 1){
        return mid;
      }else if(leftCount > (mid - low)){//[1, 4) 3
        high = mid;
      }else if(rightCount > (high - mid - 1)){//(4, 8) 3
        low = mid + 1;
      }
      
    }
    return low;
}