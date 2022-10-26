class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> leader=new ArrayList<>();

        if(n==1){

            leader.add(arr[0]);

            return leader;  }

       int minLeader=arr[n-1];

       leader.add(minLeader);

       for(int i=n-2;i>=0;i--){

           if(minLeader<=arr[i]){

               minLeader=arr[i];

               leader.add(minLeader);}}

        Collections.reverse(leader);
        return leader;
    }
}
