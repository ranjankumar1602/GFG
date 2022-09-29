class Solution
{
    public static void sort012(int a[], int n)
    {
        int count0 = 0;
        int count1 = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == 0) {
                count0++;
            }
            if(a[i] == 1) {
                count1++;
            }
        }
        for(int i = 0; i < count0; i++) {
            a[i] = 0;
        }
        for(int i = count0; i < count0 + count1; i++) {
            a[i] = 1;
        }
        for(int i = count0 + count1; i < a.length; i++) {
            a[i] = 2;
        }
    }
}
