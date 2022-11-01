package analisisalgoritmos;

import java.io.*;

/**
 *
 * @author juand
 */
public class AnalisisAlgoritmos {

    File archivo;
    Solution s = new Solution();

    private void crearArchivoTexto() {

        archivo = new File("archivo.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo Creado Con exito");
            } else {
                System.out.println("Ya esta creado el archivo");
            }

        } catch (IOException exepcion) {
            exepcion.printStackTrace(System.out);
        }
    }

    //genera numero aleatorio
    static int generaNumeroAleatorio(int minimo, int maximo) {

        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

    //generar pruebas
    public void crearPrueba() {

        try {
            FileWriter es = new FileWriter("archivo.txt");

            int i = 0;
            int min = 1;
            int max = 50000;

            while (i < 100) {
                String a = "";
                
                int b = generaNumeroAleatorio(min, max);
                int c = generaNumeroAleatorio(min, max);
                int d = generaNumeroAleatorio(min, max);
                int f = generaNumeroAleatorio(min, max);
                int g = generaNumeroAleatorio(min, max);
                int h = generaNumeroAleatorio(min, max);
                int j = generaNumeroAleatorio(min, max);
                int l = generaNumeroAleatorio(min, max);
                int m = generaNumeroAleatorio(min, max);
                int n = generaNumeroAleatorio(min, max);
                a = "" + b + " " + c + " " + d+ " " + f+ " " + g+ " " + h+ " " + j+ " " + l+ " " + m+ " " + n;
                es.write(a + "\r\n");
                
                i++;
            }
            es.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

    }

    // metodo para leer el archivo
    private void leer() {
        try {
            FileReader lector = new FileReader("archivo.txt");
            BufferedReader lectura = new BufferedReader(lector);

            String contenido ;

            int cont = 1;
            while (cont < 100) {
                
                contenido = lectura.readLine();
                cont++;

                String[] array = contenido.split(" ");
                int[] nums = new int[array.length];

                for (int i = 0; i < array.length; i++) {
                    nums[i] = Integer.parseInt(array[i]);
                }

                s.sortArray(nums);
         
                System.out.print("[");

                for (int i = 0; i < nums.length; i++) {

                    if (i != nums.length - 1) {

                        System.out.print(nums[i] + ",");

                    } else {
                        System.out.println(nums[i] + "]"); 

                    }

                }

            }

        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        AnalisisAlgoritmos a = new AnalisisAlgoritmos();
        // a.crearArchivoTexto(); // este metodo crea un nuevo archivo
        a.crearPrueba(); // crea un 100 nuevos casos de prueba despues de que se ejecute
        a.leer();

    }

}
