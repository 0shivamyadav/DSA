class Solution {
    public int characterReplacement(String s, int k) {
        int maxf=0;
        int maxl=0;
        int l=0;
        int[] f=new int[26];
        for(int r=0;r<s.length();r++){
            int i=s.charAt(r)-'A';
            f[i]++;
            maxf=Math.max(maxf,f[i]);
            int rp=(r-l+1)-maxf;
            while(rp>k){
                int li=s.charAt(l)-'A';
                f[li]--;
                l++;
                rp=(r-l+1)-maxf;
            }
            maxl=Math.max(maxl,r-l+1);
        }
        return maxl;
    }
}