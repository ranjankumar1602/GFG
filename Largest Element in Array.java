class Compute {
    
    public int largest(int arr[], int n)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }
        return pq.peek();
    }
}
