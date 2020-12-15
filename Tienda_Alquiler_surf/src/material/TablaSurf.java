package material;

import java.util.Objects;

public class TablaSurf implements IReservable {
    private String marca;
    private String tipo;
    private int volumen;
    private double talla;
    private int construccion;
    public final int POLIESTER=0;
    public final int EPOXY=0;
    public final int SOFTBOARD=0;
    public final int HINCHABLE=0;
    public final int INDETERMINADA=0;
    private static int precios;
    private double suplemento;

    public TablaSurf(String marca, String tipo, int volumen, double talla, int construccion, double suplemento){
        this.marca = marca;
        this.tipo = tipo;
        this.volumen = volumen;
        this.talla = talla;
        this.construccion = construccion;
        this.suplemento = suplemento;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVolumen() {
        return volumen;
    }

    public double getTalla() {
        return talla;
    }

    public static int getPrecios() {
        return precios;
    }

    public double getSuplemento() {
        return suplemento;
    }

    @Override
    public String getDenominacion(){
        return null;
    }
    
    @Override
    public String getObservaciones(){
        return null;
    }
    @Override
    public double getPrecio(int opcion){
        return opcion;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public void setConstruccion(int construccion) {
        this.construccion = construccion;
    }

    public static void setPrecios(int precios) {
        TablaSurf.precios = precios;
    }

    public void setSuplemento(double suplemento) {
        this.suplemento = suplemento;
    }

    @Override
    public String toString() {
        return "TablaSurf{" + "marca=" + marca + ", tipo=" + tipo + ", volumen=" + volumen + ", talla=" + talla + ", construccion=" + construccion + ", POLIESTER=" + POLIESTER + ", EPOXY=" + EPOXY + ", SOFTBOARD=" + SOFTBOARD + ", HINCHABLE=" + HINCHABLE + ", INDETERMINADA=" + INDETERMINADA + ", suplemento=" + suplemento + '}';
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
        final TablaSurf other = (TablaSurf) obj;
        if (this.volumen != other.volumen) {
            return false;
        }
        if (Double.doubleToLongBits(this.talla) != Double.doubleToLongBits(other.talla)) {
            return false;
        }
        if (this.construccion != other.construccion) {
            return false;
        }
        if (this.POLIESTER != other.POLIESTER) {
            return false;
        }
        if (this.EPOXY != other.EPOXY) {
            return false;
        }
        if (this.SOFTBOARD != other.SOFTBOARD) {
            return false;
        }
        if (this.HINCHABLE != other.HINCHABLE) {
            return false;
        }
        if (this.INDETERMINADA != other.INDETERMINADA) {
            return false;
        }
        if (Double.doubleToLongBits(this.suplemento) != Double.doubleToLongBits(other.suplemento)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.marca);
        hash = 29 * hash + Objects.hashCode(this.tipo);
        hash = 29 * hash + this.volumen;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.talla) ^ (Double.doubleToLongBits(this.talla) >>> 32));
        hash = 29 * hash + this.construccion;
        hash = 29 * hash + this.POLIESTER;
        hash = 29 * hash + this.EPOXY;
        hash = 29 * hash + this.SOFTBOARD;
        hash = 29 * hash + this.HINCHABLE;
        hash = 29 * hash + this.INDETERMINADA;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.suplemento) ^ (Double.doubleToLongBits(this.suplemento) >>> 32));
        return hash;
    }
}
