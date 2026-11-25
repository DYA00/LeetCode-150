// Solution for the problem, Top K Frequent Elements in Arrays & Hashing.
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<int[]> converter = new ArrayList();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            converter.add(new int[] {entry.getValue(), entry.getKey()});
        }
        converter.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = converter.get(i)[1];
        }

        return result;
    }
}
