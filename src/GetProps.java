// Getting Information from System Properties

import java.util.Properties;

public class GetProps {
    public static void main(String[] args) {
        Properties p = System.getProperties();
        System.out.println(p.getProperty("user.dir"));
        System.out.println(p.getProperty("user.name"));
        System.out.println(p.getProperty("user.home"));
        System.out.println(p.getProperty("os.name"));
        System.out.println(p.getProperty("os.version"));
        System.out.println(p.getProperty("os.arch"));
        System.out.println(p.getProperty("java.version"));
        System.out.println(p.getProperty("java.home"));
        System.out.println(p.getProperty("java.class.path"));
    }
}
