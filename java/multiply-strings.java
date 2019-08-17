class Solution {
    public String multiply(String num1, String num2) {
            if (num1 == null || num1.isEmpty() || num2 == null || num2.isEmpty()){
              return "";
            }
        
            int l1 = num1.length();
            int l2 = num2.length();
            int[] ret = new int[l1 + l2];

            for (int i = l1 - 1; i >= 0; --i) {
                for (int j = l2 - 1; j >= 0; --j) {
                    ret[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                }
            }

            for (int i = ret.length - 1; i > 0; --i) {
                ret[i - 1] += ret[i] / 10;
                ret[i] %= 10;
            }

            StringBuilder newStr = new StringBuilder();
            for (int i = 0; i < ret.length; ++i) {
                if (newStr.length() == 0 && ret[i] == 0) {
                  continue;
                }

                newStr.append(ret[i]);
            }

            if(newStr.length() == 0){
                return "0";
            }

            else {
                return newStr.toString();
            }

        }
}
