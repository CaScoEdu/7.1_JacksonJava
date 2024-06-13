// Laboratorio 1 Conversione da oggetto Java a JSON e viceversa
package jacksonjava;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import java.io.File;

public class JacksonJava {

   
    public static void main(String[] args) {
        // Crea un ObjectMapper Jackson
        ObjectMapper mapper = new ObjectMapper();

        // Crea un oggetto Java
        Ordine obj1 = new Ordine();
        obj1.setId(1);
        obj1.setArticolo("Pantalone");
        obj1.setImporto(25.90);
        
        try {
            File fOut = new File("ordine.json");
        
            // ** Converte l'oggetto Java in file JSON **
            mapper.writeValue(fOut, obj1);

            // Converte l'oggetto Java in stringa JSON string, formato compact
            String jsonString = mapper.writeValueAsString(obj1);
	
            // Converte l'oggetto Java in stringa JSON string, formato indentato
            String jsonString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1);
        
            // Mostra la string JSON a video
            System.out.println("File ordine.json generato:\n");
            System.out.println(jsonString2);
       
            //** Converte un file JSON in oggetto Java **
        
            File fIn = new File("ordine.json");
            Ordine obj2 = mapper.readValue(fIn, Ordine.class);
            
            // Mostra i dati letti a video
            System.out.println("\nDati letti dal file JSON:");
            System.out.println("Id = " + obj2.getId());
            System.out.println("Articolo = " + obj2.getArticolo());
            System.out.println("Importo = " + obj2.getImporto());

        }
        catch (Exception e)
        {}
    }
}
