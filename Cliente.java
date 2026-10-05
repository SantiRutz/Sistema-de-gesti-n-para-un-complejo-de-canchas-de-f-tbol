public class Cliente {
    private String dni;
    private String nombre;
    private String telefono;
    private boolean frecuente;

    public Cliente() {
    }

    public Cliente(String dni, String nombre, String telefono, boolean frecuente) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.frecuente = frecuente;
    }

    public String getDni(){return dni;}
    public String getNombre(){return nombre;}
    public String getTelefono(){return telefono;}
    public boolean isFrecuente(){return frecuente;}

    public void setFrecuente(boolean frecuente){
        this.frecuente = frecuente;
    }

}
