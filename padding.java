public class padding{

    CreateMatrix matrix;

    padding(String file){
        matrix = new CreateMatrix(file);
        System.out.println("count = " + matrix.getBlocks().size());
    }

    int getMissingCount(){
        int last = matrix.getBlocks().size() - 1;
        byte buffer[][] = matrix.getBlocks().get(last);
        int i=0, j=0, count=0;
        for(; i<4; i++){
            for(; j<4; j++){
                if(buffer[j][i] == 0){
                    break;
                }
                count++;
            }
        }
        int missing = 16-count;
        return missing;
    }

    void getPaddedMatrix(){
        byte buffer[][] = matrix.getBlocks().get(matrix.getBlocks().size() - 1);
        int buffer_padding = getMissingCount();
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(buffer[j][i] == 0){
                    buffer[j][i] = (byte)buffer_padding;
                }
            }
        }
    }

    void printLast(){

        int last = matrix.getBlocks().size() - 1;
        byte lastbuffer[][] = matrix.getBlocks().get(last);
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(lastbuffer[i][j] + " ");
            }
            System.out.println();
        }
    }

}