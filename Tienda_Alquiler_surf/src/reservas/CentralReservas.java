package reservas;

public class CentralReservas {
    private final int MAXRESERVAS=0;
    private int numReservas;

    public CentralReservas(int numReservas) {
        this.numReservas = numReservas;
    }
    
    public void addReserva(Reserva reserva){
    
    }

    @Override
    public String toString() {
        return "CentralReservas{" + "MAXRESERVAS=" + MAXRESERVAS + ", numReservas=" + numReservas + '}';
    }
    
    
}
