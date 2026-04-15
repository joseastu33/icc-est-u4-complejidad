import java.util.ArrayList;
import java.util.List;

public class Generador {
    public static List<Estudiante> generarListado(int cantidadEstudiantes){
        List<Estudiante> estudiantes = new ArrayList<>(); //-- ArrayList es un arreglo vacio []
        // Esto es lo que debe retornar: List Estudiante
        //en java debe existir return si o si
        for (int i =0; i < cantidadEstudiantes; i++){
            String nombre = "Estudiante_"+i; //str + int = string, "Estudiante_0"
            int edad = i; // edad = 0
            Estudiante nuevo = new Estudiante(nombre, edad); //Instanciando un estudiante en la variable "nuevo"
            //El constructor crea una INSTANCIA a partir de los parametros
            //como dice generarListado, guardo al objeto ahi
            estudiantes.add(nuevo); //añadir CADA OBJETO
        }
        return estudiantes; //por el List<Estudiante>
        //va a devolver el LIST estudiante, el generarListado es un metodo con un parametro
        //el List da un error: List cannot be resolved to a type (seguramente no está importado)
        //quiere decir que el List es una clase, pero las clases son "public class List" NO LIST

        //si el metodo dice GENERAR ESTUDIANTES, los guardo en un ARREGLO, hago algo con ese OBJETO
        
    }
}
