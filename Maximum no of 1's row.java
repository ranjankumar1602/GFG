class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        int max = 0;
        int count = 0;
        int ind = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(Mat[i][j] == 1) {
                    count++;      
                }
            }
            if(max < count) {
                max = count;
                ind = i;
            }
            count = 0;
        }
        return ind;
    }
}
