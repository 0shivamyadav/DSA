class Solution {
    public int numberOfSubstrings(String s) {
         int fq[]=new int [26];
         int c=0;
         int l=0;
        for(int i=0;i<s.length();i++)
        {
            fq[s.charAt(i)-'a']++;
            while(fq[0]>0 && fq[1]>0 && fq[2]>0)
            {
                c+=s.length()-i;
                fq[s.charAt(l)-'a']--;
                l++;
            }
        }
        return c;
        // HashMap<Character,Integer> map =new HashMap<>();
        // for(int i=0;i<s.length();i++)
        // {
        //     char right=s.charAt(i);
        //     map.put(right,map.getOrDefault(right,0)+1);
        //     while(map.size()==3)
        //     {
        //         c+=s.length()-i;
        //         char left=s.charAt(l);
        //         map.put(left,map.get(left)-1);
        //         l++;
        //     }
        // }
        // return c;

    }
}