class Solution{
    static long factorial(int N){
        // code here
        if(N <= 1) {
            return 1;
        }
        long arr[] = new long[N+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i <= N; i++) {
            arr[i] = i * arr[i-1];
        }
        return arr[N];
    }
}
