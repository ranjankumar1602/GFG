class Solution {
    ArrayList<String> pattern(String S) {
        // code here
        int i = S.length();
        ArrayList<String> list = new ArrayList<>();
        while(i > 0 ) {
            list.add(S.substring(0,i));
            i--;
        }
        return list;
    }
};
