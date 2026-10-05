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
    
    
    public int getNumero(){return this.numero;}
    public Cliente getCliente(){return cliente;}
    public Cancha getCancha(){return cancha;}
    public String getFecha(){return fecha;}
    public int getHoraInicio(){return horaInicio;}
    public String getEstado(){return estado;}
    public ArrayList<DetalleReserva> getDetalles(){return detalles;}

    public int getHoraFin(){
        return this.horaInicio + this.cantidadHoras;
    }
    
        public void agregarDetalle(DetalleReserva det){
        detalles.add(det);
    }

    public double calcularTotalExtras(){
        double total=0.0;
        for(DetalleReserva det: detalles){
            total = total + det.calcularSubtotal();
        }
        return total;
    }
    
        public double calcularPrecioCancha(){
        double total=0.0;
        for(int hora=horaInicio; hora<getHoraFin(); hora++){
            if(hora>=20){
                total = total + cancha.getPrecioHora()*1.20;
            }else{
                total = total + cancha.getPrecioHora();
            }
        }
        return total;
    }
}
