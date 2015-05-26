package codesandtags.singleton;


import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Edwin on 25/05/2015.
 */
public class SingletonTest extends TestCase {

    @Test
    public void testInstance(){
        assertNotNull(Singleton.getInstance());
    }

    @Test
    public void testCount(){
        System.out.println("Count => " + Singleton.getInstance().getCount());
        assertTrue( Singleton.getInstance().getCount() > 1);
    }

}