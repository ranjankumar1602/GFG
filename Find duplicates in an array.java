class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(-1);
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                set2.add(arr[i]);
            }else {
                set.add(arr[i]);
            }
        }
        for(int i:set2){
            list.add(i);
        }
        Collections.sort(list);
        return (list.size()==0)?list2:list;
    }
}
