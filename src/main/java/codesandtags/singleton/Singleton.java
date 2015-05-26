package codesandtags.singleton;

/**
 * Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes
 * under creational pattern as this pattern provides one of the best ways to create an object.
 * Created by Edwin on 25/05/2015.
 */
public class Singleton {

    private static Singleton instance = new Singleton();
    private static int count = 1;

    private Singleton(){ }

    public static Singleton getInstance(){
        count++;
        return instance;
    }

    /**
     * Count the number of intances create
     * @return
     */
    public int getCount() {
        return count;
    }
}
