public class Transpose {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] tran = new int[mat.length][mat[0].length];

        for (int i = 0; i<mat.length; i++){
            for (int j=0; j<mat[0].length; j++){
                tran[j][i] = mat[i][j];
            }
        }


        for (int i = 0; i<mat.length; i++){
            for (int j=0; j<mat[0].length; j++){
                System.out.print(tran[i][j] + " ");
            }
            System.out.println();
        }
    }
}
