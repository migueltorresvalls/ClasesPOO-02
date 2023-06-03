import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FicheroIO {
    private String file; 

	public FicheroIO(String file){
		this.file = file; 
	}

	public ArrayList<Planetas> readFichero() throws IOException, NumberFormatException{
        ArrayList<Planetas> planetas = new ArrayList<>();

		BufferedReader br = new BufferedReader(new FileReader(new File(file))); 

		String linea = br.readLine();
		while(linea != null){
            // Lees lineas y diferencias los campos
            // x = ?; 
            // color = ?;
			linea = br.readLine(); 
            System.out.println(linea);

            Planeta planeta = new Planeta(x, y, color, animacion, relleno);
            planetas.add(planeta);
		}
		br.close(); 
        return planetas; 
	}
}
