package net.sf.cglib.test;

import net.sf.cglib.core.DebuggingClassWriter;
import org.junit.Test;

public class CGLibProxyTest {

    @Test
    public void test() {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, getDebugPath());
        UserService proxy = new CGLibProxy().getProxy(UserServiceImpl.class);
        proxy.getUserName(1000);
    }

    private static String getDebugPath() {
        String path = CGLibProxyTest.class.getResource("/").getPath();
        int index = path.indexOf("/target");
        if (index > -1) {
            return path.substring(0, index) + "/target/classes";
        }
        return path;
    }

}
