public class Automobile {
    private String targa;
    private String marca;
    private String modello;
    private int cilindrata;
    private int anno;
    private int numero;

    public Automobile(String targa, String marca, String modello, int cilindrata, int anno, int numero){
        this.targa=targa;
        this.marca=marca;
        this.modello=modello;
        this.cilindrata=cilindrata;
        this.anno=anno;
        this.numero=numero;
    }

    public Automobile(Automobile a){
        this.targa=a.targa;
        this.marca=a.marca;
        this.modello=a.modello;
        this.cilindrata=a.cilindrata;
        this.anno=a.anno;
        this.numero=a.numero;
    }

    public String getTarga() {
        return targa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }
    public int getCilindrata() {
        return cilindrata;
    }
    public int getAnno() {
        return anno;
    }
    public int getNumero() {
        return numero;
    }

    
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

}
