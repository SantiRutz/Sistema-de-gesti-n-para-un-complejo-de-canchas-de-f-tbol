public class Complejo
{
    private String nombre;
    private String direccion;
    private ArrayList<Cancha> canchas;
    private ArrayList<ServicioExtra> servicios;

    public Complejo(String nombre, String direccion)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.canchas = new ArrayList<Cancha>();
        this.servicios = new ArrayList<ServicioExtra>();
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void agregarCancha(Cancha cancha)
    {
        canchas.add(cancha);
    }

    public void agregarServicio(ServicioExtra servicio)
    {
        servicios.add(servicio);
    }

    public ArrayList<Cancha> getCanchas()
    {
        return canchas;
    }

    public ArrayList<ServicioExtra> getServicios()
    {
        return servicios;
    }
}




