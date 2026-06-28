class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
		for(int n: nums) {
			frequencyMap.put(n, frequencyMap.getOrDefault(n, 0)+1);
		}
		
        return frequencyMap.entrySet().stream()
               .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry :: getKey).mapToInt(Integer::intValue).limit(k).toArray();
		  
    }
}
