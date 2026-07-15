
public class main{

    public static void main(String[] args){
        
        //CreateMatrix matrix = new CreateMatrix(args[0]);
        padding pad = new padding(args[0]);
        pad.getPaddedMatrix();
        pad.printLast();
    }

}