class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum1=0;
        int sum2=0;
        int n=cardPoints.length;
        for(int i=0;i<n;i++)
        {
            sum1+=cardPoints[i];
        }
        int win=n-k;
        int sum = 0;
        for(int i=0;i<win;i++)
        {
            sum += cardPoints[i];
        }
        int min=sum;
        for(int i=win;i<n;i++)
        {
            sum = sum - cardPoints[i - win] + cardPoints[i];
            if(sum<min)
            {
                min=sum;
            }
        }
        return sum1-min;
    }
}