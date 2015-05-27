package codesandtags.singleton;

/**
 * Created by Edwin on 26/05/2015.
 */
public class Jugador {
    Marciano marcianos = Marciano.getMarcianos();

    public void destruirMarcianos(int disparos) {
        for (int i = 0; i < disparos ; i++) {
            marcianos.derribarMarciano();
        }
    }
}
