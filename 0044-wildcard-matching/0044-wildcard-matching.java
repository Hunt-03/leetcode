class Solution {
    public boolean isMatch(String s, String p) {
        int sl=s.length();
        int pl=p.length();
        int st=-1;
        int m=-1;
        int i=0,j=0;
        
        while(i<sl){
            if(j<pl && (p.charAt(j)=='?'|| p.charAt(j)==s.charAt(i))){
            i++;
            j++;
            continue;}
            if(j<pl && p.charAt(j)=='*'){
                st=j++;
                m=i;
                continue;
            }
        if(st>=0){
            j=st + 1;
            i=++m;
            continue;
        }
        return false;
        }
       while(pl>j && p.charAt(j)=='*')
       j++;
     
    return j==pl;
    }
}