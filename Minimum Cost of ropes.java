long minCost(long arr[], int n) 
    {
        PriorityQueue<Long> queue = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
            queue.add(arr[i]);
        }
        long cost = 0;
        while(queue.size() > 1) {
            long first = queue.poll();
            long second = queue.poll();
            queue.add(first+second);
            cost += (first+second);
        }
        
        return cost;
    }
