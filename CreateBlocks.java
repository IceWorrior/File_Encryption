import java.util.ArrayList;
import java.io.*;

public class CreateBlocks{
    
    int block_count = 0;

    CreateBlocks(String file){
        try{
            InputStream input = new FileInputStream(file);
            ArrayList<Byte[][]> bytes = new ArrayList<>();

            while(input.read() != -1){
                CreateMatrix matrix = new CreateMatrix(file);
                block_count++;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    int getBlockCount(){
        return block_count;
    }
}