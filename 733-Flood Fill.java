class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        dfs(image,sr,sc,image[sr][sc],newColor);
        return image;
    }
    public void dfs(int[][] image, int r, int c, int iniColor,int newColor){
        if(r<0||r>=image.length||c<0||c>=image[0].length)
            return;
        if(image[r][c]==newColor||image[r][c]!=iniColor)
            return;
        image[r][c] = newColor;
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                if(i*j==0&&i+j!=0)
                    dfs(image,r+i,c+j,iniColor,newColor);
            }
        }
    }
}
