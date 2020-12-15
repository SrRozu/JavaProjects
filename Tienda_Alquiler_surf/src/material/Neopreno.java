package material;

import java.util.Objects;

public class Neopreno implements IReservable{
    private String marca;
    private String categoria;
    private int talla;
    private boolean mangasLargas;
    private boolean piernasLargas;
    private int cremallera;
    final int DELANTERA=1;
    final int TRASERA=2;
    final int SIN=3;
    private static int precios;
    private double suplemento;

    public Neopreno(String marca, String categoria, int talla, boolean mangasLargas, boolean piernasLargas, int cremallera, double suplemento) {
        this.marca = marca;
        this.categoria = categoria;
        this.talla = talla;
        this.mangasLargas = mangasLargas;
        this.piernasLargas = piernasLargas;
        this.cremallera = cremallera;
        this.suplemento = suplemento;
    }

    public String getMarca() {
        return marca;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public int getTalla() {
        return talla;
    }

    public int getCremallera() {
        return cremallera;
    }

    public static int getPrecios() {
        return precios;
    }

    public double getSuplemento() {
        return suplemento;
    }
    
    public boolean IsMangasLargas(){
        return mangasLargas;
    }
    
    public boolean IsPiernasLargas(){
        return piernasLargas;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public void setMangasLargas(boolean mangasLargas) {
        this.mangasLargas = mangasLargas;
    }

    public void setPiernasLargas(boolean piernasLargas) {
        this.piernasLargas = piernasLargas;
    }

    public void setCremallera(int cremallera) {
        this.cremallera = cremallera;
    }

    public static void setPrecios(int precios) {
        Neopreno.precios = precios;
    }

    public void setSuplemento(double suplemento) {
        this.suplemento = suplemento;
    }
    
    public String getDenominacion(){
        return null;
    }
    public String getObservaciones(){
        return null;
    }

    public double getPrecio(int opcion){
        return opcion;
    }
    
    @Override
    public String toString() {
        return "Neopreno{" + "marca=" + marca + ", categoria=" + categoria +
                ", talla=" + talla + ", mangasLargas=" + mangasLargas + 
                ", piernasLargas=" + piernasLargas + ", cremallare=" + 
                cremallera + ", DELANTERA=" + DELANTERA + ", SIN=" + SIN + 
                ", suplemento=" + suplemento + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Neopreno other = (Neopreno) obj;
        if (this.talla != other.talla) {
            return false;
        }
        if (this.mangasLargas != other.mangasLargas) {
            return false;
        }
        if (this.piernasLargas != other.piernasLargas) {
            return false;
        }
        if (this.cremallera != other.cremallera) {
            return false;
        }
        if (this.DELANTERA != other.DELANTERA) {
            return false;
        }
        if (this.SIN != other.SIN) {
            return false;
        }
        if (Double.doubleToLongBits(this.suplemento) != Double.doubleToLongBits(other.suplemento)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.categoria, other.categoria);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.marca);
        hash = 71 * hash + Objects.hashCode(this.categoria);
        hash = 71 * hash + this.talla;
        hash = 71 * hash + (this.mangasLargas ? 1 : 0);
        hash = 71 * hash + (this.piernasLargas ? 1 : 0);
        hash = 71 * hash + this.cremallera;
        hash = 71 * hash + this.DELANTERA;
        hash = 71 * hash + this.TRASERA;
        hash = 71 * hash + this.SIN;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.suplemento) ^ (Double.doubleToLongBits(this.suplemento) >>> 32));
        return hash;
    }
}
