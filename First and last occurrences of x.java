class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> ans = new ArrayList<>();
        long start = -1;
        long end = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                if(start == -1) {
                    start = i;
                }
                end = i;
            }
        }
        ans.add(start);
        ans.add(end);
        return ans;
    }
}
