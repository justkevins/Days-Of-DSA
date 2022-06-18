class Solution {
    public int[] shuffle(int[] nums, int n)
    {
        int ans[ ] = new int[2 * n]; //New Array for the resultant array
        
        for(int i = 0; i < 2 * n; i++)
        {
            if(i % 2 == 0) //Selecting the even Index(x1,x2.....)
                ans[i] = nums[i / 2];
            else
                ans[i] = nums[n + i/ 2]; //Selecting tbe second of the array 
        }
        return ans;
    }
}