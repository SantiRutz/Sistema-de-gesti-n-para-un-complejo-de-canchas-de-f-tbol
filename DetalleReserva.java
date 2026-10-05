public class DetalleReserva { 
    private ServicioExtra servicio; 
    private int cantidad;
    
    public DetalleReserva(ServicioExtra servicio, int cantidad) { 
        this.servicio = servicio;
        this.cantidad = cantidad; 
    } 
        
    public ServicioExtra getServicio() {
        return servicio;
    } 
    
    public int getCantidad() { 
        return cantidad;
    }
    
    public double calcularSubtotal(){
        return this.servicio.getPrecio()*getCantidad();
    }
    
}
