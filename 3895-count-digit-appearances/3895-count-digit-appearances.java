class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        char d = (char) (digit + '0'); 

        for (int num : nums) {
            String s = Integer.toString(num); 
            for (char c : s.toCharArray()) {
                if (c == d) {
                    count++;
                }
            }
         }
         return count;
    }
 }
