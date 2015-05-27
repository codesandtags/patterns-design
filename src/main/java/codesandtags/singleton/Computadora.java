package codesandtags.singleton;

/**
 * Created by Edwin on 26/05/2015.
 */
public class Computadora {
    private Marciano marcianos;

    public Computadora(){
        marcianos = Marciano.getMarcianos();
    }
    
    public void crearMarcianos(){
        marcianos.crearMarcianos();
    }
}
