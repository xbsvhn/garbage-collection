/**
 * @author namvh
 */
public class GBExample {

    private String name;

    public GBExample(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        GBExample obj1 = new GBExample("obj1");
        GBExample obj2 = new GBExample("obj2");
        GBExample obj3 = new GBExample("obj3");

        //unreference
        obj1 = null;

        obj2 = obj3;

        new GBExample("anonymous obj");

        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + " was cleaned");
        //different order when run it again because we do not know when gc will collect object
    }
}
