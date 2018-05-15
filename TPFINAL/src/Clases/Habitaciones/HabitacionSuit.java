
package Clases.Habitaciones;

public class HabitacionSuit extends Habitacion {
    
    public HabitacionSuit(String calidad, int cantidad, boolean disponibilidad, String estado, float precio)
    {
        super(calidad, cantidad, disponibilidad, estado, precio);
    }

@Override
public void reservar()
    {
        if("Suit".equals(getCalidad()))
        {
            if(getDisponibilidad()==true)
            {
                System.out.println("Habitacion disponible.");
                //hacer la reserva.
            }
            
            else
            {
                System.out.println("Habitacion no disponible.");
            }
        }
        else
        {
            System.out.println("La solicitud no cumple con los requisitos para este tipo de habitacion.");
        }
    }
    
}

