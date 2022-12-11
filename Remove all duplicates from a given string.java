class Solution {
    String removeDuplicates(String str) {
        // code here
        HashSet<Character> set = new HashSet<>();
        String ans = "";
        for(int i = 0; i < str.length(); i++) {
            if(!set.contains(str.charAt(i))) {
                set.add(str.charAt(i));
                ans += str.charAt(i);
            }
        }
        return ans;
    }
}
