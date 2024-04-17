class Solution {
    public int myAtoi(String s) {
        int len=s.length();
        int index=0;
        while(index<len && s.charAt(index)==' ') index++;
        if(index>=len) return 0;
        boolean neg=(s.charAt(index)=='-');
        if(neg || s.charAt(index)=='+') ++index;
        int max=Integer.MAX_VALUE/10;
        int result=0;
        while(index<len && '0'<=s.charAt(index) && s.charAt(index)<='9'){

            int digit=s.charAt(index)-'0';
           if(result>max || (result==max && digit>7)){
                return (neg)?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            result=(result*10)+digit;
            index++;

        }
        return (neg)?-result:result;

    }    
}