class Solution {
    public boolean hasDuplicate(int[] nums) {
        return (int) Arrays.stream(nums).distinct().count() < nums.length;
    }
}