
package Clases.Habitaciones;

public abstract class Habitacion {
    
    private int idHabitacion;
    private String calidad;// Tipo de habitacion, Suit o Normal.
    private int cantidad;// De personas que puede tener la habitacion.
    private boolean disponibilidad;// Disponibilidad.
    private String estado; // Mantenimiento, sucia o limpia, que exploto o no.
    private float precio;// Chequear.
    
    public Habitacion(String calidad, int cantidad, boolean disponibilidad, String estado, float precio)
    {
        this.calidad=calidad;
        this.cantidad=cantidad;
        this.disponibilidad=disponibilidad;
        this.estado=estado;
        this.precio=precio;
    }
    public String getCalidad()
    {
        return calidad;
    }
    public int getCantidad()
    {
        return cantidad;
    }
    public boolean getDisponibilidad()
    {
        return disponibilidad;
    }
    public String getEstado()
    {
        return estado;
    }
    public float getPrecio()
    {
        return precio;
    }
            
            
            
            
    public abstract void reservar();
    
}
