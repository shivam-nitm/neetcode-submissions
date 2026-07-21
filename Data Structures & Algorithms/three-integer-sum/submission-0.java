class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        int n = nums.length;

        // Try all triplets
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> triplet = Arrays.asList(
                                nums[i], nums[j], nums[k]);

                        // Sort to avoid duplicates
                        Collections.sort(triplet);

                        set.add(triplet);
                    }
                }
            }
        }

        return new ArrayList<>(set);
}
}