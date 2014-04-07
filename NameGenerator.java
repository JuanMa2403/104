
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
    private static int tresDelNombre=3;
    private static int tresDelApellido=3;
    private static int tresDelApMadre=2;
    private static int tresDeCiudad=3;
    private  String ctresDelNombre;
    private  String ctresDelApellido;
    private  String ctresDelApMadre;
    private  String ctresDeCiudad;
    /**
     * Constructor for objects of class NameGenerator
     */
   /** public NameGenerator(String nombre,String apellido,String ApMadre,String ciudad)
    {
        // initialise instance variables
        ctresDelNombre=nombre.substring(0, tresDelNombre);
        ctresDelApellido=apellido.substring(0, tresDelApellido);
        ctresDelApMadre=ApMadre.substring(0, tresDelApMadre);
        ctresDeCiudad=ciudad.substring(0, tresDeCiudad);
    }*/

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String generateStarWarsName(String nombre,String apellido,String ApMadre,String ciudad)
    {
        // put your code here
        ctresDelNombre=nombre.substring(0, tresDelNombre);
        ctresDelApellido=apellido.substring(0, tresDelApellido);
        ctresDelApMadre=ApMadre.substring(0, tresDelApMadre);
        ctresDeCiudad=ciudad.substring(0, tresDeCiudad);
        return ctresDelApellido+ctresDelNombre+" "+ctresDelApMadre+ctresDeCiudad;
    }
}
