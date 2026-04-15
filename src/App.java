import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int cantidadEstudiantes = 3000000;
        int cantidad = 100_000_000; // se coloca en guiones bajos cada grupo de ceros
        List<Estudiante> estudiantes = Generador.generarListado(cantidadEstudiantes);
        //List<Estudiante> = generar una lista, listar a cada estudiante
        //estudiantes = guardar en una VARIABLE "estudiantes"
        //Generador.generarListado(cantidadEstudiantes) = del archivo Generador el método generarListado debe generar un 
        //listado con el millón (1000000)
        // for (Estudiante est: estudiantes){
        //    System.out.println(est.nombre); //como son 3M de usuarios, se imprimen datos de cada uno con el for
        //    System.out.println(est.edad);
        String nombreBuscar = "Estudiante_2900111"; //encontrar este
        int intentos = 0;
        for (Estudiante est: estudiantes){
            if (est.nombre.equals(nombreBuscar)){ // El == sirve para comparar numeros, para comparar texto
                System.out.println("EXISTE");
            }else{
                intentos++;
            } 
        }
        System.out.println("FIN");
        System.out.println(2900111);
        }
        }

