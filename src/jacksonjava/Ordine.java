
package jacksonjava;


public class Ordine  {

    private int id;
    private String articolo;
    private double importo;

    // metodi get e set
    public void setId(int id) {
        this.id = id;
    }

    public void setArticolo(String articolo) {
        this.articolo = articolo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    public int getId() {
        return id;
    }

    public String getArticolo() {
        return articolo;
    }

    public double getImporto() {
        return importo;
    }
   
}
