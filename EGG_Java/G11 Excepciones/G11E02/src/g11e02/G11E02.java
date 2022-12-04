//Definir una Clase que contenga algún tipo de dato de tipo array y
//agregue el código para generar y capturar una excepción 
//ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango).

package g11e02;

public class G11E02 {

    public static void main(String[] args) {
        String[] colors = {"Red", "Blue", "Green", "Yellow"};

        try {
            System.out.println(colors[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e);
            System.out.println(e.fillInStackTrace());
        } finally {
            System.out.println("'try catch' ha terminado");
        }

    }
}
