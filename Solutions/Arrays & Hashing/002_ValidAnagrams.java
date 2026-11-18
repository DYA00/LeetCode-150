// Solution for the problem, Valid Anagrams in the Arrays & Hashing.
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sScanner = new HashMap<>();
        HashMap<Character, Integer> tScanner = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            sScanner.put(s.charAt(i), sScanner.getOrDefault(s.charAt(i), 0) + 1);
            tScanner.put(t.charAt(i), tScanner.getOrDefault(t.charAt(i), 0) + 1);
        }

        return sScanner.equals(tScanner);
    }
}
