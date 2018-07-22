class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0) 
            return false;
        int i=0,j=0;
        while(i>=0&&j>=0){
            //System.out.println(matrix[i][j]);
            if(matrix[i][j]==target) 
                return true;
            if(j<matrix[0].length-1&&matrix[i][j+1]<=target)
                j++;
            else if(i<matrix.length-1&&matrix[i+1][j]<=target)
                i++;
            else{
                matrix[i][j]=target+1;
                j--;
            }
        }
        return false;
    }
}
