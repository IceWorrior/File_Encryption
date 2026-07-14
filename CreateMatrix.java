import java.io.InputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

class CreateMatrix{

    CreateMatrix (String file){
        try {

            InputStream input = new FileInputStream(file);
            int data, i=0, j=0;
            byte[][] buffer = new byte[4][4];
            ArrayList<byte[][]> bufferList = new ArrayList<>();

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

            for( i=0; i<4; i++){
                for( j=0; j<4; j++){
                    System.out.print(buffer[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Block count :: " + bufferList.size());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}