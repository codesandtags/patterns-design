package codesandtags.singleton;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Edwin on 26/05/2015.
 */
public class SingletonTest {

    @Test
    public void testGetInstance() throws Exception {
        Singleton prueba = Singleton.getInstance();
        Assert.assertNotNull(prueba);
    }
}