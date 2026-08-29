class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       // int n=names.length();
         int m=heights.length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m-i-1;j++)
            {
                if(heights[j]<heights[j+1])
                {
                    int t=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=t;
                    String c=names[j];
                    names[j]=names[j+1];
                    names[j+1]=c;
                }
            }
        }
        return names;

        // HashMap<Integer,String> map=new HashMap<>();
        // for(int i=0;i<m;i++)
        // {
        //     map.put(heights[i],names[i]);
        // }
        // Arrays.sort(heights);
        // int index=0;
        // String [] s=new String [names.length];
        // for(int i=names.length-1;i>=0;i--)
        // {
        //     s[index++]=map.get()
        // }


    }
}