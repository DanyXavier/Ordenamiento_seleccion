import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] array = {10,7,3,13,2};
        System.out.println("Array inicial: "+ Arrays.toString(array));
        // ciclo para recorrer la posicion a intercambiar
        for (int i = 0; i < array.length; i++) {
            int minValue=array[i]; // 10
            int minValueIndex = i; // 0
            // j  = 1
            // encontrar el elemento mas bajo y su index
            for (int j = minValueIndex +1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minValueIndex = j;
                }
                // minValue = 2
                // minValueIndex = 4
            }
            // intercambio
            int temp = array[i]; // 10
            array[i] = minValue; //[2,7,3,13,2]
            array[minValueIndex] = temp; //[2,7,3,13,10]
        }
        System.out.println("Array final: "+ Arrays.toString(array));
    }
}
/**
 * [3,2,7,5]
 * elemento mas bajo (2) 
 * indice (1)
 * intercambio
 * [2,3,7,5]
 * elemento mas bajo (5)
 * indice (3)
 * intercambio
 * [2,3,5,7]
 */