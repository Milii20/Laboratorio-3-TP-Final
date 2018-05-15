
package Clases.Habitaciones;

public class HabitacionDoble extends HabitacionNormal{

public HabitacionDoble(String calidad, int cantidad, boolean disponibilidad, String estado, float precio)
{
    super(calidad, cantidad, disponibilidad, estado, precio);//Pasa atributos de HABITACION!!!.
}

@Override
public void reservar()
    {
        if(("normal".equals(getCalidad()))&&getCantidad()==2)
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


