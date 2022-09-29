class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] == 0 && max == 0) {
                max = 1;
            }
 
            if (sum == 0) {
                max = i + 1;
            }
            Integer prev = map.get(sum);
            if (prev != null)
                max = Math.max(max, i - prev);
            else
                map.put(sum, i);
        }
 
        return max;
    }
}
