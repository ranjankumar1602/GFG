class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        int count = 0;
        for(int i:map.keySet()) {
            if(map.get(i) > n/k) {
                count++;
            }
        }
        return count;
    }
}
