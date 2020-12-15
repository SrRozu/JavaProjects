package reservas;

public class Reserva {
    private static int numReserva;
    private int idReserva;
    private iCliente cliente;
    private IReservable materiales;
    private int numMateriales;
    private final int MAXPRODUCTOSXRESERVA=0;
    private int opcionTiempo;
    final int UNAHORA=0;
    final int MEDIODIA=0;
    final int UNDIA=0;
    final int DOSDIAS=0;
    final int CUATRODIAS=4;
    final int UNASEMANA=7;
    private GregorlanCalendar fechaReserva;
    private double total;

    public Reserva(int idReserva, iCliente cliente, IReservable materiales, int numMateriales, int opcionTiempo, GregorlanCalendar fechaReserva, double total) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.materiales = materiales;
        this.numMateriales = numMateriales;
        this.opcionTiempo = opcionTiempo;
        this.fechaReserva = fechaReserva;
        this.total = total;
    }
    
    public void addMaterial(IReservable material){
    
    }
    
    public double getTotal(){
    
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", cliente=" + cliente + ", materiales=" + materiales + ", numMateriales=" + numMateriales + ", MAXPRODUCTOSXRESERVA=" + MAXPRODUCTOSXRESERVA + ", opcionTiempo=" + opcionTiempo + ", UNAHORA=" + UNAHORA + ", MEDIODIA=" + MEDIODIA + ", UNDIA=" + UNDIA + ", DOSDIAS=" + DOSDIAS + ", CUATRODIAS=" + CUATRODIAS + ", UNASEMANA=" + UNASEMANA + ", fechaReserva=" + fechaReserva + ", total=" + total + '}';
    }
    
    
    
    
}
