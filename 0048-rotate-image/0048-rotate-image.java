class Solution {
    public void rotate(int[][] martix) {
        for(int i=0;i < martix.length;i++){
            for(int j=i;j < martix[0].length;j++){
                int temp = 0;
                temp = martix[i][j];
                martix[i][j] = martix[j][i];
                martix[j][i] = temp;
            }
        }
        for(int i=0;i < martix.length;i++){
            for(int j=0;j < martix.length/2;j++){
                int temp = 0;
                temp = martix[i][j];
                martix[i][j] = martix[i][martix.length-1-j];
                martix[i][martix.length-1-j] = temp;
            }
        }
    }
}