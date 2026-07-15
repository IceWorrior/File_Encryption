import java.io.InputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

class CreateMatrix{

    ArrayList<byte[][]> bufferList = new ArrayList<>();

    CreateMatrix (String file){
        try {

            InputStream input = new FileInputStream(file);
            int data, i=0, j=0;
            byte[][] buffer = new byte[4][4];
            //ArrayList<byte[][]> bufferList = new ArrayList<>();

            do{
                
                data = input.read();
                if(data == -1){
                    break;
                }
                buffer[i++][j] = (byte)data;

                if(i==4){
                    ++j;
                    i=0;
                }
                if(j==4){
                    bufferList.add(buffer);
                    buffer = new byte[4][4];
                    j=0;
                    i=0;
                }
                

            }while(true);

            bufferList.add(buffer);
            input.close();

            System.out.println("Block count :: " + bufferList.size());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    ArrayList<byte[][]> getBlocks(){
        return bufferList;
    }


    void PrintAll(){
        int length = bufferList.size();
        for(int i=0; i<length; i++){
            byte[][] buffer = bufferList.get(i);
            for(int j=0; j<4; j++){
                for(int k=0; k<4; k++){
                    System.out.print(buffer[j][k] + " ");
                }
                System.out.println();
            }

        }
        System.out.println();
    }
    
}