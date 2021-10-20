class Solution {
    public String addStrings(String num1, String num2) {
        int f = num1.length()-1, s = num2.length()-1;
        StringBuilder res = new StringBuilder();
        int zero = (int)'0';
        boolean carry = false;
        while (f >= 0 && s >= 0){
            int tmp = ((int)num1.charAt(f) - zero) + ((int)num2.charAt(s) - zero);
            if (carry) tmp++; 
            res.append(tmp % 10);
            carry = tmp > 9;
            f--;
            s--;
        }
        while (f >= 0){
            int tmp = ((int)num1.charAt(f) - zero);
            if (carry) tmp++; 
            res.append(tmp % 10);
            carry = tmp > 9;
            f--;
        }
        while (s >= 0){
            int tmp = ((int)num2.charAt(s) - zero);
            if (carry) tmp++; 
            res.append(tmp % 10);
            carry = tmp > 9;
            s--;
        }
        if (carry)
        res.append(1);
        return res.reverse().toString();
    }
}
