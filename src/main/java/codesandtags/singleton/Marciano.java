package codesandtags.singleton;

/**
 * Created by Edwin on 26/05/2015.
 */
public final class Marciano {

    private static final Marciano marciano = new Marciano();
    private static int cantidadMarcianos;

    private Marciano(){
        cantidadMarcianos = 10;
    }

    public static Marciano getMarcianos(){
        return marciano;
    }

    public  void derribarMarciano(){
        if (cantidadMarcianos > 0) {
            System.out.println(" Has derribado un Marciano!");
            cantidadMarcianos--;
        }
    }

    public void crearMarcianos(){
        System.out.println("Se han creado magicamente un marciano ");
        if(cantidadMarcianos > 0)
            cantidadMarcianos++;
    }

    public void cuantosQuedan(){
        if (cantidadMarcianos > 0){
            System.out.println(" Quedan =>" + cantidadMarcianos + " Marcianos.");
        }else{
            System.out.println(" Felicidades, has derribado todos los Marcianos");
        }
    }

    public int getCantidad() {
        return cantidadMarcianos;
    }
}
