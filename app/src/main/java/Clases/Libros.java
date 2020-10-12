package Clases;

public class Libros {
    private int farenheith;
    private int revival;
    private int alquimista;
    private int elPoder;
    private int despertar;
    public Libros() {
        farenheith = 7000;
        revival = 22000;
        alquimista = 45000;
        elPoder = 88000;
        despertar = 156000;

    }

    public int getFarenheith() {
        return farenheith;
    }

    public void setFarenheith(int farenheith) {
        this.farenheith = farenheith;
    }

    public int getRevival() {
        return revival;
    }

    public void setRevival(int revival) {
        this.revival = revival;
    }

    public int getAlquimista() {
        return alquimista;
    }

    public void setAlquimista(int alquimista) {
        this.alquimista = alquimista;
    }
}
