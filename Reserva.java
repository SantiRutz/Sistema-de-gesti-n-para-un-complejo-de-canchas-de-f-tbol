import java.util.ArrayList;

public class Reserva {
    private int numero;
    private Cliente cliente;
    private Cancha cancha;
    private String fecha;
    private int horaInicio;
    private int cantidadHoras;
    private String estado;
    private ArrayList<DetalleReserva> detalles;
    
    public Reserva (int codigo, Cliente cli, Cancha can, String fecha, int horaInicio, int cantidadHoras){
        this.numero=codigo;
        this.cliente=cli;
        this.cancha=can;
        this.fecha=fecha;
        this.horaInicio=horaInicio;
        this.cantidadHoras=cantidadHoras;
        this.estado="RESERVADA";
        detalles = new ArrayList<DetalleReserva>();
    }
}
