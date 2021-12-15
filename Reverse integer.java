class Solution {
    public int reverse(int x){
        boolean n = x < 0;
        if (n) x = x * -1;
        try {
            return n ? Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString()) * -1 :
                    Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
        }catch (Exception e){
            return 0;
        }
    }
}
