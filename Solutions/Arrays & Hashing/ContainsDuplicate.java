// Solution for the problem, Contains Duplicate in the Arrays & Hashing.
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> checker = new HashSet<>();

        for (int num : nums) {
            if (!checker.add(num)) {
                return true;
            }
        }

        return false;
    }
}
