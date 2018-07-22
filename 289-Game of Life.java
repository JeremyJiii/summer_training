class Solution {
    public void gameOfLife(int[][] board) {
        //状态存入两位的数字中；
        if(board.length==0) return;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] <<=1;
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] = next(board,i,j);
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] &=1;
            }
        }
    }
    private int next(int[][] board,int i,int j){
        int num= 0;
        for(int bias=-1;bias<=1;bias++){
            for(int bias1=-1;bias1<=1;bias1++){
                if(i+bias>=0&&i+bias<board.length&&j+bias1>=0&&j+bias1<board[0].length){
                    if(!(bias==0&&bias1==0))
                        if((board[i+bias][j+bias1]>>1)==1)
                            num++;
                }
            }
        }
        //System.out.println(num);
        if(num==3)
            board[i][j] |= 1;
        if(num==2)
            board[i][j] |= board[i][j]>>1&1;
        return board[i][j];
    }
}
