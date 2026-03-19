class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int[] arr : nums) {
            HashSet<Integer> seen = new HashSet<>();

            for (int num : arr) {
                if (seen.add(num)) {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == n) {
                result.add(key);
            }
        }

        
        Collections.sort(result);

        return result;
    }
}