public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] array = new int[] {1,2,3,4,5};
        System.out.println(array[0]);
        System.out.println(array); //Java imprime el OBJETO, NO es el ARREGLO ---> [I@372]
        //for normal
        for (int i = 0; i < array.length; i++){ //---> el incremento i++ para que EL BUCLE no se HAGA INFINITO
            System.out.println(array[i]);}
            
        //otro for (for each)
        for(int i : array){ //-->la i va a ser cada termino (1, luego el 2, 3..) PERO NO son POSICIONES, son ELEMENTOS, asi que IMPRIME todo el ARREGLO
            System.out.println(i); //---> For each --> elementos, for normal ---> indices
        }
        }
    }

