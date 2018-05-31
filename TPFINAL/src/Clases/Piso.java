
package Clases;

import Clases.Habitaciones.Habitacion;
import java.util.ArrayList;

public class Piso {
    private ArrayList<Habitacion> habitaciones;// arraylist habitaciones por piso
    
    public Habitacion getHabitacion(int i)
    {
        return habitaciones.get(i);
    }
    public ArrayList<Habitacion> getHabitaciones()
    {
        return habitaciones;
    }

}
