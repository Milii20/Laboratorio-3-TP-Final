
package Clases.Habitaciones;

public abstract class HabitacionNormal extends Habitacion{
    
    // para que crear un constructor aca, si tenemos que decir que compare si el atributo de calidad de la Habitacion si es suit o normal, para mi que esta demas.. atte. Ani la mejor xDD
    // Mili replanteate borrar esta clase..
    public HabitacionNormal(String calidad, int cantidad, boolean disponibilidad, String estado, float precio)
    {
        super(calidad, cantidad, disponibilidad, estado, precio);
    }

}
