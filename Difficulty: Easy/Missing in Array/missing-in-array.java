class Solution {
    int missingNum(int arr[]) {
        // code here
        long n=arr.length+1;
        long t=n*(n+1)/2;
        long sum=0;
        for(int a:arr)
        {
            sum+=a;
        }
        return (int)(t-sum);
    }
}