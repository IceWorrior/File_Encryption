public class SubstitueMatrix{
    int matrix[][];
    
    SubstitueMatrix(){
        matrix = new matrix[64][64];
    }

    static void createSubstitue(){
        for(int i=0; i<64; i++){
            for(int j=0; j<64; j++){
                matrix[i][j] = 0;
            }
        }
    }

    static void printMatrix(){
        for(int i=0; i<64; i++){
            for(int j=0; j<64; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}