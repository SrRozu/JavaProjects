package material;

public class CentralMateriales extends TablaSurf{
    final int MAXMATERIALES=0;
    private int numTablas;
    private int numTrajes;

    public CentralMateriales(String marca, String tipo, int volumen, double talla, int construccion, double suplemento) {
        super(marca, tipo, volumen, talla, construccion, suplemento);
    }

    
    public void nuevaTabla(String marca, String tipo, int volumen, double talla, int construccion, double suplemento){
        
    }
    
    public TablaSurf getTabla(int I){
        return null;
    }
    
    public void eliminaTabla(TablaSurf t){
        
    }
    
    public void nuevoTraje(String marca, String categoria, int talla, boolean mangaslargas, boolean piernaslargas, int cremallera, double suplemento){
        
    }
    public void eliminaTraje(Neopreno n){
        
    }
    
    public Neopreno getTraje(int I){
        return I;
    }
    
    public String tablasToString(){
        
    }
    
    public String trajesToString(){
        
    }
    
    
    
    
    
    
    
    
    
    
}
