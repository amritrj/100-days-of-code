class Solution {
    public int[] twoSum(int[] nums, int target) {
        int singleSolution = 0;
        int[] solutionNumbers = new int[2];
        for (int i = 0; i < nums.length && singleSolution == 0; i++) {
            for (int y = 0; y < nums.length && singleSolution == 0; y++) {
                if (nums[y] + nums[i] == target && y != i) {
                    if (y < i) {
                        solutionNumbers[0] = y;
                        solutionNumbers[1] = i;
                    }
                    else {
                        solutionNumbers[0] = i;
                        solutionNumbers[1] = y;
                    }
                    singleSolution = 1;
                    
                }
            }
        }
        return solutionNumbers;
    }
}
    