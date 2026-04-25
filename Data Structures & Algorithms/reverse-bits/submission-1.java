class Solution {
    public int reverseBits(int n) {

        int res = 0;
        int right;
        for(int i =0 ; i<32;i++)
        {
            right = (n>>i)&1;
            res = res +(right<<(31-i));
            
        }

        return res;
        
    }
}
