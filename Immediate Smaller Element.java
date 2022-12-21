class Solution {
    void immediateSmaller(int arr[], int n) {
        // code here
        for(int i = 0; i < n; i++) {
            if(i+1==n) {
                arr[i] = -1;
            }else {
                if(arr[i+1] < arr[i]) {
                    arr[i] = arr[i+1];
                }else {
                    arr[i] = -1;
                }
            }
        }
    }
}
