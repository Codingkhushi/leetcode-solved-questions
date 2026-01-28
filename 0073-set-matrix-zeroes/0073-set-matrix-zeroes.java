class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstR = false;
        boolean firstC = false;
        //first mark 1st col and 1st row if they have 0
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstC = true;
                break;
            }
        }
        for(int j=0;j<n;j++){
            if(matrix[0][j]==0){
                firstR = true;
                break;
            }
        }
        //mark for inner matrix
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //set matrix to 0 from the markers 
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0] == 0 || matrix[0][j]==0 ){
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstR){
            for(int j=0;j<n;j++){
                matrix[0][j] = 0;
            }
        }
        if(firstC){
            for(int i=0;i<m;i++){
                matrix[i][0] = 0;
            }
        }
    }
}
----------
2nd soultion - 
    
class Solution {
    public void setZeroes(int[][] martix) {
        int n = martix.length;
        int m = martix[0].length;
        int x = 1;
        int y = 1;
        //checking row and col if 0 is present then mark
        for(int i=0;i<n;i++){
            if(martix[i][0]==0){
                x = 0;
            }
        }
        for(int j=0;j<m;j++){
            if(martix[0][j]==0){
                y = 0;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(martix[i][j]==0){
                    martix[i][0] = 0;//markers
                    martix[0][j] = 0;
                }
            }
        }
        for(int j=1;j<m;j++){
            if(martix[0][j]==0){
                for(int i=1;i<n;i++){
                    martix[i][j]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            if(martix[i][0]==0){
                for(int j=1;j<m;j++){
                    martix[i][j] = 0;
                }
            }
        }
        if(y==0){
            for(int i=0;i<m;i++){
                martix[0][i] = 0;
            }
        }
        if(x==0){
            for(int j=0;j<n;j++){
                martix[j][0] = 0;
            }

        }

    }
}
