/*
 Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
 Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

Example 1:
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:
Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
 */


class Solution {
    public int longestPalindrome(String s) {
        char[] ch = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(char c: ch) {
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		 int even_sum = 0;
		 int odd_sum = 0;
		 for(Character c: map.keySet()) {
			 if(map.get(c) % 2 == 0) {
				 even_sum += map.get(c);
			 }
			 else {
				 if(odd_sum == 0)
					 odd_sum += map.get(c);
					else
						odd_sum += map.get(c) - 1; 
			 }
		 }
		return even_sum+odd_sum;
    }
}