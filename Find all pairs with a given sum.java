class Solution {
    public:
    vector<pair<int,int>> allPairs(int A[], int B[], int N, int M, int X)
    {
        // Your code goes here   
        set<int> sets;
        vector<pair<int, int>> sol;
         for(int i = 0; i < M; i++){
             sets.insert(B[i]);
         }
         for(int i = 0; i < N; i++){
             int ans = X - A[i];
             if(sets.find(ans) != sets.end()){
                  sol.push_back(make_pair(A[i], ans));
             }
         }
        sort(sol.begin(), sol.end());
        return sol;
    }
};
