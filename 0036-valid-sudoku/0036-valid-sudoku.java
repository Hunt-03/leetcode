class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] r=new int[9][9];
        int[][] c=new int[9][9];
        int[][] b=new int[9][9]; 
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++) {
                if (board[i][j]=='.')
                continue;
                int num=board[i][j]-'1';
                int bo=((i/3)*3)+(j/3);
                if (r[i][num]==1||c[j][num]==1)
                return false;
                if (b[bo][num]==1)
                return false;
                r[i][num]=1;
                c[j][num]=1;
                b[bo][num]=1;
            }
        }
        return true;
    }
}
