//leetcode  problem : https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/



class Solution {
    public int strStr(String haystack, String needle) {

        int index = haystack.indexOf(needle);
        if(index!=-1){
            return index;
        }
        else{
            return -1;
        }
    }
}



