class Solution{
    public String reverseWords(String str){
        char[] res = str.toCharArray();
        int start=0, end;
        char tmp;

        while((end = str.indexOf(' ', start)) != -1){
            for (int i = start; i < start + (end-start) / 2; i++){
                tmp = res[i];
                res[i] = res[start + end - i-1];
                res[start + end - i-1] = tmp;
            }
            start = end+1;
        }
        for (int i = start; i < start + (res.length - start) / 2; i++){
            tmp = res[i];
            res[i] = res[start + res.length - i-1];
            res[start + res.length - i-1] = tmp;
        }
        return String.valueOf(res);
    }
}
