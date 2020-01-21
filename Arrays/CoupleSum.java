/* 
Problem Description:
Given an array of integers, find two numbers such that they sum up to a specific target.
The method coupleSum should return the indices of the two numbers in the array, where 
index1 must be less than index2. Please note that the indices are not zero based, and 
you can assume that each input has exactly one solution. Target linear runtime and space complexity.
*/

class CoupleSum {
    // Initial Solution:
    public static int[] coupleSum(int[] numbers, int target) {
        int[] output = new int[2];
        for (int i=0; i < numbers.length; i++) {
            for (int j=1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target && i < j) {
                    output[0] = i + 1;
                    output[1] = j + 1;
                }
            }
        }
        return output;
    }

    // Solution Optimized for time complexity:
    public static int[] coupleSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < numbers.length; i++){
            int n = numbers[i];
            if(map.containsKey(n)){
                return new int[]{map.get(n), i+1};
            } else {
                map.put(target-n, i+1);
            }
        }
        return null;
    }
}