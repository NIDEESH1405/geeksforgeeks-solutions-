class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int a:arr)
        {
            if(a>largest)
            {
                second=largest;
                largest=a;
            }
            if(a>second && a!=largest)
            {
                second=a;
            }
        }
        if(second==Integer.MIN_VALUE) return -1;
        return second;
    }
}