
package Clases.Gente;

public class Pasajero {
    
    private int ID;// Numero de identidad de la persona solo para uso del hotel.
    private String NyA;// Nombre y Apellido.
    private String numDoc; //Es alfa numerico debido al que pasaporte tiene letras y numeros.
    private String mail;
    private String telefono;
    private String direccion;
    
    
    public Pasajero()
    {
        //lo crea vacio, porque siempre es util que exista
    }    
    public Pasajero(int Id,String NyA,String numDoc,String mail, String telefono, String direccion)
    {
        this.ID=Id;
        this.NyA=NyA;
        this.numDoc=numDoc;
        this.mail=mail;
        this.telefono=telefono;
        this.direccion=direccion;
        
    }
    
}
