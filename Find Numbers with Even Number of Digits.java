class Solution {
    public int findNumbers(int[] num) 
    {
        // keep track of the count
        int even = 0;
        
        // loop through all the numbers
        for (int i=0; i<num.length; i++)
        {
            
            int digits = 0, number = num[i];
            // To count the number of digits in a number
            while (number!=0) 
            {
                number /= 10;
                ++digits;
            }
            
            // Increments if the number has even digits
            if (digits%2==0) 
            {
                even++;
            }
            
        }
        
        return even;
    }
}