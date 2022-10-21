public static int equilibriumPoint(long arr[], int n) {
        if(n==1) {
            return 1;
        }
        int l = 0;
        int r = n - 1;
        long lsum=arr[0];
        long rsum=arr[n-1];
        while(l < r) {
            if(lsum == rsum ) {
                if(r - l == 2)
                    return(l + 2);
            }
            if(lsum < rsum) {
                l++;
                lsum += arr[l];
            }else {
                r--;
                rsum+=arr[r];
            }

        }

        return -1;

    }
