int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int ans = (n * (n+1))/2;
        return ans - sum;
    }
