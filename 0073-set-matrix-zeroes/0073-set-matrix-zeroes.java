class Solution {
    class Pair {
        int i;
        int j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        Stack<Pair> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    st.push(new Pair(i, j));
                }
            }
        }

        while (st.size() > 0) {
            Pair p = st.pop();

            int i = p.i;
            int j = p.j;

            for (int k = 0; k < m; k++)
                matrix[i][k] = 0;

            for (int k = 0; k < n; k++)
                matrix[k][j] = 0;

        }

    }
}