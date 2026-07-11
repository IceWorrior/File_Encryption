import java.io.InputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

class CreateMatrix{
    CreateMatrix(String file){
        try{

            InputStream input = new FileInputStream(file);
            ArrayList<Byte> buffer = new ArrayList<>();
            int data = 0;
            while(data != -1){
                data = input.read();
                buffer.add((byte)data);
            }

            System.out.println(buffer);

        }
        catch(Exception e){
            
            e.printStackTrace();
        }
    }
}