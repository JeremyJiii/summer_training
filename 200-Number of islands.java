class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0) return 0;
        int cnt = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    ++cnt;
                }
            }
        }
        return cnt;
    }
    public void dfs(char[][] grid,int i, int j){
            if(i<0||j<0||i>=grid.length||j>=grid[0].length) return;
            if(grid[i][j]!='1') return;
            grid[i][j] = '0';
            for(int a=-1;a<=1;a++){
                for(int b=-1;b<=1;b++){
                    if(a+b==1||a+b==-1) dfs(grid,i+a,j+b);
                }
            }
        }
}
