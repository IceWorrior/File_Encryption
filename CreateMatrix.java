import java.io.InputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

class CreateMatrix{

    int count = 0;

    CreateMatrix(String file){
        try{

            InputStream input = new FileInputStream(file);
            Byte[][] bytes = new Byte[4][4];
            for(int i=0; i<4; i++){
                for(int j=0; j<4; j++){
                    bytes[j][i] = (byte)input.read();
                }
            }
            
            
            for(int i=0; i<4; i++){
                for(int j=0; j<4; j++){
                    System.out.print(bytes[i][j] + " ");
                    if(bytes[i][j] != -1) count++;
                }
                System.out.println();
            }

        }
        catch(Exception e){
            
            e.printStackTrace();
        }
    }

    int getCount(){
        return 16-count;
    }
}