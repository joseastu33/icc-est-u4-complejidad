public class Estudiante {
    public String nombre; //-- atributo nombre
    public int edad; //-- atributo edad

    public Estudiante(String nombre, int edad){ //--- Constructor (metodo especial)
        //para CONSTRUIR la INSTANCIA. es donde se INICIALIZAN las VARIABLES
        this.nombre = nombre; //this nombre (variable de arriba) es igual a 
        this.edad = edad;  //this le da el mismo valor de nombre a la variable
    }
}
