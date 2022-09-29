class Solution
{
    public long sum_of_square_oddNumbers(long n)
    {
        // Code here
        long sum = 0;
        long i = 1;
        for(long count = 1; count <= n; count++) {
            sum += Math.pow(i,2);
            i += 2;
        }
        return sum;
    }
}
