class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer> res = new ArrayList<>();
        int start_r = 0;
        int start_c = 0;
        int end_r = mat.length-1;
        int end_c = mat[0].length-1;
        if(mat.length == 0){
            return res;
        }
        while(start_r <= end_r && start_c <= end_c){
            //top row - start row to end col
            for (int i = start_c; i <= end_c; i++) {
                res.add(mat[start_r][i]);
            }
            start_r++;
            //right to bottom - start+1 row to end row
            for(int j=start_r;j<=end_r;j++){
                res.add(mat[j][end_c]);
            }
            end_c--;
            //bottom row - end col -1 to start col
            if(start_r <= end_r){
                for(int i=end_c;i>=start_c;i--){
                res.add(mat[end_r][i]);
                }
                end_r--;
            }
            //bottom to left - end row -1 to start row
            if(start_c <= end_c){
                for(int j=end_r;j>=start_r;j--){
                res.add(mat[j][start_c]);
                }
                start_c++;
            }
        }
        return res;
    }
}