import java.util.*;

public class examenU1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ELIMINAR DUPLICADOS
        int[] arr = new int[10];
        System.out.println("ELIMINAR DUPLICADOS ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = leerEntero(sc, "Número " + (i+1) + ": ");
        }

        Set<Integer> sd = new LinkedHashSet<>();
        for (int num : arr) {
            sd.add(num);
        }

        System.out.println("Arreglo sin duplicados: " + sd);

        //ORDENAR FILAS (3x3)
        System.out.println("\nORDENAR FILAS (3x3) ");
        int[][] m = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = leerEntero(sc, "Matriz ["+i+"]["+j+"]: ");
            }
        }

        System.out.println("Matriz original:");
        imprimirMatriz(m);

        // Ordenamos cada fila con método Burbuja
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - 1; j++) {
                for (int k = 0; k < 3 - 1 - j; k++) {
                    if (m[i][k] > m[i][k+1]) {
                        int temp = m[i][k];
                        m[i][k] = m[i][k+1];
                        m[i][k+1] = temp;
                    }
                }
            }
        }

        System.out.println("\nMatriz con filas ordenadas:");
        imprimirMatriz(m);

        //PROMEDIO POR CAPA (3x3x3)
        System.out.println("\nPROMEDIO POR CAPA (3x3x3) ");
        int[][][] cubo = new int[3][3][3];
        for (int capa = 0; capa < 3; capa++) {
            System.out.println("Capa " + capa + ":");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    cubo[capa][i][j] = leerEntero(sc, "Cubo ["+capa+"]["+i+"]["+j+"]: ");
                }
            }
        }

        for (int capa = 0; capa < 3; capa++) {
            int suma = 0;
            int contador = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    suma += cubo[capa][i][j];
                    contador++;
                }
            }
            double promedio = (double) suma / contador;
            System.out.println("Promedio de la capa " + capa + ": " + promedio);
        }

        sc.close();
    }

    // Método auxiliar para imprimir matrices 3x3
    public static void imprimirMatriz(int[][] m) {
        for (int[] fila : m) {
            for (int elem : fila) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    // Método auxiliar para leer enteros con validación
    public static int leerEntero(Scanner sc, String mensaje) {
        int num;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {        //valida si es número
                num = sc.nextInt();
                break;
            } else {
                System.out.println("ingrese un número entero válido.");
                sc.next(); 
            }
        }
        return num;
    }
}


