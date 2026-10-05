public class Cancha {
    private int numero;
    private String tipo;
    private double precioHora;

    public Cancha() {
    }

    public Cancha(int numero, String tipo, double precioHora) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioHora = precioHora;
    }

    public int getNumero(){return numero;}
    public String getTipo(){return tipo;}
    public double getPrecioHora(){return precioHora;}

    public void setPrecioHora(double precioHora){
        this.precioHora = precioHora;
    }

}
