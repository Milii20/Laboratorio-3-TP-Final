
package Clases;
import Clases.Gente.Pasajero;
import Clases.Gente.Personal;
import Tarea.Tarea;
import java.util.ArrayList;

public class Hotel {
    
    private ArrayList<Piso> pisos;//tienen que ser arrayList
    private ArrayList<Personal> personal;// tienen que ser arrayList
    private ArrayList<Reserva> reservas;//tienen que ser arrayList
    private ArrayList<Tarea> tareas;//tienen que ser arrayList
    private ArrayList<Pasajero> pasajeros; // lista de pasajeros potenciales
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
public void Simulacion(int modo)
{
    iniciar(modo);
    consultarPreguntaMenu();
}
/*
persistentes (guardar en archivo)

1 solo json con un jsonobject de hotel, con jsonArrays de
reservas
habitaciones
personas


hotel es el que hace las cosas (interfaz)

*/
/// inicia el programa, lo unico que hara el main sera crear un hotel y llamar a iniciar
public void iniciar(int modo)
{
    // cargar del json las personas
    //fijarse si existe json estado
    //cargarlo si existe, sino
    
    
}
public void crearPasajero(int Id,String NyA,String numDoc,String mail, String telefono, String direccion)
{//crea un pasajero y lo agrega al JSON
    
    Pasajero nuevoPasajero = new Pasajero(Id,NyA,numDoc,mail,telefono,direccion);
    //guardarJSONPasajero
}
public int consultarPreguntaMenu()
{
    int aux=0;
    //insertar menu aqui
    return aux;
}
public void ejecutarAccion(int i)
{
    switch (i)
    {
        
        case 1: 
        {
            
        };
        case 2: 
        {
            
        };
        case 3: 
        {
            
        };
        case 4: 
        {
            
        };
        case 5: 
        {
            
        };
        case 6: 
        {
            
        };
        case 7: 
        {
            
        };
        default: 
        {
            
        };
        
    }
}
}

