class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long flag = 0;
        long prod = 1;
        for(int i : nums) {
            if(i == 0) {
                flag++;
            }else {
                prod *= i;
            }
        }
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            if (flag > 1) {
                arr[i] = 0;
            }else if (flag == 0) {
                arr[i] = (prod / nums[i]);
            }else if (flag == 1 && nums[i] != 0) {
                arr[i] = 0;
            }else
                arr[i] = prod;
        }
        return arr;
	  } 
  }
