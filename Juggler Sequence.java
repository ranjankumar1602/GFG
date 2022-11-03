class Solution{
    static List<Integer> jugglerSequence(int N){
        ArrayList<Integer> list = new ArrayList<Integer>();
        jugglerSequence(list, N);
        list.add(1);
        return list;
    }
    private static void jugglerSequence(List<Integer> list, int N) {
        if(N == 1) {
            return;
        }
        list.add(N);
        if(N%2==0) {
            jugglerSequence(list, (int)Math.sqrt(N));
            
        }else {
            jugglerSequence(list, (int)Math.pow(N,1.5));
        }
    }
}
