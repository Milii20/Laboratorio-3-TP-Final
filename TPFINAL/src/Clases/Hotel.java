
package Clases;
import Clases.Gente.Personal;
import Tarea.Tarea;
import java.util.ArrayList;

public class Hotel {
    
    private ArrayList<Piso> pisos;//mal, tienen que ser arrayList
    private ArrayList<Personal> personal;//mal, tienen que ser arrayList
    private ArrayList<Reserva> reservas;//mal, tienen que ser arrayList
    private ArrayList<Tarea> tareas;//mal, tienen que ser arrayList
    private Administracion administracion;
    private int cantHabitacionesPorPiso;

public Hotel(int nuevaCantHabitaciones)
    {
        pisos = new ArrayList<Piso>();
        personal = new ArrayList<Personal>();
        reservas = new ArrayList<Reserva>();
        tareas = new ArrayList<Tarea>();
        administracion = new Administracion();
        cantHabitacionesPorPiso = nuevaCantHabitaciones;
        
    }
}

