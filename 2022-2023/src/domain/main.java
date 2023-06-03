import java.io.IOException;

public class main {
    public static void main(String[] args){
        FicheroIO ficheroIO = new FicheroIO("resources/juego.txt");

        try {
            ficheroIO.readFichero();
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
