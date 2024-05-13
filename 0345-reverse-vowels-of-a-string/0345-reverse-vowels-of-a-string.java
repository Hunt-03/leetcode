class Solution {
    public String reverseVowels(String s) {
        char[] a= s.toCharArray();
        int l=a.length;
        int c=0;
        char[] b= new char[l];
        for(int i=0;i<l;i++){
            
            if(a[i]=='a'||a[i]=='e'||a[i]=='o'||a[i]=='i'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='O'||a[i]=='I'||a[i]=='U'){
                    b[c]=a[i];
                    c++;
                    a[i]='^';
            }
        }
       
         c=0;
        for(int i=l-1;i>=0;i--){
            if(a[i]=='^'){
                a[i]=b[c];
                c++;
            }
        }
       String se= new String(a);
       return se;
    }
}