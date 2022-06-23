class Solution {
    public int[] countBits(int n)
    {
        int arr[] = new int [n+1];
        int count = 0;
        
        for(int i = 0; i <= n; i++)
        {
            String s = Integer.toBinaryString(i);
            for(char c: s.toCharArray())
            {
                if(c== '1')
                {
                    count++;
                }
            }
            arr[i] = count;
            count = 0;
        }
        return arr;
    }
}