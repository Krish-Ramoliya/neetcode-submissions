class Solution {
    public int[] countBits(int n) {
        
        int res[]= new int[n+1];
        res[0]=0;
        int x ;
        int count=0;
        for(int i = n ;i>0;i--)
        {
            x=i;
            while(x!=0)
            {
                x = x&(x-1);
                count++;
            }
            res[i]=count;
            count=0;


        }
    
        return res;
    }
    
}
