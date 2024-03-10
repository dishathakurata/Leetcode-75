package leetcode;

//1768. Merge strings alternatively

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder res = new StringBuilder();

        while(i < word1.length() || j < word2.length()) {
            if(i < word1.length()) {
                res.append(word1.charAt(i));
                i++;
            }

            if(j < word2.length()) {
                res.append(word2.charAt(j));
                j++;
            }
        }

        return res.toString();
    }
}