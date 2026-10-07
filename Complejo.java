
import java.util.ArrayList;

public class Complejo {

    private ArrayList<Cliente> clientes;
    private ArrayList<Cancha> canchas;
    private ArrayList<ServicioExtra> servicios;
    private ArrayList<Reserva> reservas;

    public Complejo() {

        clientes = new ArrayList<>();
        canchas = new ArrayList<>();
        servicios = new ArrayList<>();
        reservas = new ArrayList<>();

    }

    public void cargarDatosIniciales(){


        // ==========================================
        // CANCHAS
        // ==========================================

        Cancha can1 = new Cancha(1, "Futbol 5", 10000);
        Cancha can2 = new Cancha(2, "Futbol 5", 10000);
        Cancha can3 = new Cancha(3, "Futbol 7", 15000);
        Cancha can4 = new Cancha(4, "Futbol 7", 15000);

        canchas.add(can1);
        canchas.add(can2);
        canchas.add(can3);
        canchas.add(can4);

        // ==========================================
        // SERVICIOS EXTRA
        // ==========================================

        ServicioExtra s1 = new ServicioExtra(1, "Pelota", 1000);
        ServicioExtra s2 = new ServicioExtra(2, "Pecheras", 500);
        ServicioExtra s3 = new ServicioExtra(3, "Parrilla", 5000);

        servicios.add(s1);
        servicios.add(s2);
        servicios.add(s3);

        // ==========================================
        // CLIENTES
        // ==========================================

        Cliente c1 = new Cliente("30111222", "Juan Perez", "3534111111", true);
        Cliente c2 = new Cliente("31222333", "Ana Gomez", "3534222222", false);
        Cliente c3 = new Cliente("32333444", "Carlos Lopez", "3534333333", false);

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        // ==========================================
        // RESERVA 1
        // ==========================================

        Reserva r1 = new Reserva(1, c1, can1, "20/11/2026", 19, 2);

        r1.agregarDetalle(new DetalleReserva(s1, 1));
        r1.agregarDetalle(new DetalleReserva(s2, 2));

        agregarReserva(r1);

        // ==========================================
        // RESERVA 2
        // ==========================================

        Reserva r2 = new Reserva(2, c2, can3, "20/11/2026", 18, 1);

        r2.agregarDetalle(new DetalleReserva(s3, 1));

        agregarReserva(r2);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Cancha> getCanchas() {
        return canchas;
    }

    public ArrayList<ServicioExtra> getServicios() {
        return servicios;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public Cliente obtenerCliente(String dni) {

        for (Cliente cliente : clientes) {

            if (cliente.getDni().equals(dni)) {
                return cliente;
            }
        }

        return null;
    }

    public Cancha obtenerCancha(int numero) {

        for (Cancha cancha : canchas) {

            if (cancha.getNumero() == numero) {
                return cancha;
            }
        }

        return null;
    }

    public ServicioExtra obtenerServicio(int codigo) {

        for (ServicioExtra servicio : servicios) {

            if (servicio.getCodigo() == codigo) {
                return servicio;
            }
        }

        return null;
    }

    public Reserva obtenerReserva(int numero) {

        for (Reserva reserva : reservas) {

            if (reserva.getNumero() == numero) {
                return reserva;
            }
        }

        return null;
    }


    //revisa hora por hora si alguna reserva ya esta usando la cancha
    public boolean estaDisponible(Reserva nueva) {
        for (Reserva reserva : reservas) {

            if (!reserva.getEstado().equals("CANCELADA")){
                for (int hora = nueva.getHoraInicio(); hora < nueva.getHoraFin(); hora++){
                    if (reserva.ocupa(nueva.getCancha().getNumero(), nueva.getFecha(), hora)){
                        return false;
                    }
                }
            }
        }
        return true;
    }


    //se agrega solo si esta dentro del horario (8 a 24) y la cancha esta libre
    public boolean agregarReserva(Reserva reserva) {
        if (reserva.getHoraInicio() < 8){
            return false;
        }
        if (reserva.getHoraFin() > 24){
            return false;
        }
        if (!estaDisponible(reserva)){
            return false;
        }
        reservas.add(reserva);
        return true;
    }


    public void mostrarAgenda(String fecha) {
        for (Reserva reserva : reservas) {

            if (reserva.getFecha().equals(fecha)){
                System.out.println(reserva.mostrarInformacion());
            }
        }
    }


}
