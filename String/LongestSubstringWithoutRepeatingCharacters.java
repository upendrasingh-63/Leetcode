class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> h = new HashSet<>();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (h.contains(s.charAt(i))) {
                while (s.charAt(j) != s.charAt(i)) {
                    h.remove(s.charAt(j));
                    j++;
                }
                j++;
            } else {
                h.add(s.charAt(i));
                max = Math.max(max, i - j + 1);
            }
        }
        return max;
    }
}

// Approach:
// Use a Sliding Window: Maintain a sliding window using two pointers (i and j) to represent the current substring without repeating characters.
// HashSet for Tracking: Use a HashSet to keep track of characters in the current window.
// Expand and Contract Window:
// Iterate through the string with the i pointer.
// If the character at i is already in the HashSet, move the j pointer to the right until the duplicate character is removed from the HashSet.
// Add the character at i to the HashSet and update the maximum length of the substring.
// Update Maximum Length: Continuously update the maximum length of the substring without repeating characters.
