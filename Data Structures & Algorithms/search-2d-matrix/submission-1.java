class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int r = 0;
        int c= matrix[0].length-1;

        while(c>=00&&r<matrix.length)
        {
            if(target==matrix[r][c]) return true;
            if(target<matrix[r][c]) c--;
            else
                r++;
            
        }

        return false;
        
    }
}
