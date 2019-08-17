class Solution {
    public String longestCommonPrefix(String[] strs) {
        //no common prefix
        if(strs.length == 0){
            return "";
        }

        if(strs.length == 1){
            return strs[0];
        }

        String pre = strs[0];
        for(int i = 1; i< strs.length; i++){
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() -1);
                if (pre.length() == 0){
                    return "";
                }
            }
        }

        return pre;
    }
}
