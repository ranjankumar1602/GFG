class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        for(long i : a) {
            if(i > max) {
                max = i;
            }
            if( i < min) {
                min = i;
            }
        }
        pair ans = new pair(min, max);
        return ans;
    }
}
