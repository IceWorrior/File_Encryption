import java.util.ArrayList;
import java.io.*;

public class CreateBlocks{
    
    int block_count = 0;

    CreateBlocks(String file){
        try{
            InputStream input = new FileInputStream(file);
            ArrayList<Byte[][]> bytes = new ArrayList<>();

            CreateMatrix matrix = new CreateMatrix(file);

            int counter =0;
            while(input.read() != -1){
                new CreateMatrix(file);
                if(counter%16 == 0){
                    block_count++;
                }
                counter++;
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