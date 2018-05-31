/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea;

/**
 *
 * @author usuario
 */
public abstract class Tarea {
    private int numHabitacion;//sobre que hab se hacen las cosas
    private int cantTurnos;// se va a ir restando hasta 0, cuando llega a 0 se elimina la tarea
    
    
    
    public Tarea(int cantTurnos,int numHabitacion)
    {
        this.numHabitacion=numHabitacion;
        this.cantTurnos = cantTurnos;
        
    }
    public abstract String ejecutar();
}
