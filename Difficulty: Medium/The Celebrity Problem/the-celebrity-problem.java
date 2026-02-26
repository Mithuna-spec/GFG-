class Solution {
    public int celebrity(int mat[][]) {
        // code here
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<mat.length; i++){
            st.push(i);
        }
        while(st.size()>1){
            int r = st.pop();
            int c = st.pop();
            if(mat[r][c] == 1){
                st.push(c);
            }
            if(mat[r][c] == 0){
                st.push(r);
            }
        }
        int ans = st.peek();
        for(int i=0; i<mat.length; i++){
            if(i != ans){
                if(mat[ans][i] == 1 || mat[i][ans]==0){
                    return -1;
                }
            }
        }
        return ans;
    }
}