package support;

public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext{
    public ClassPathXmlApplicationContext(String[] configLocations){

    }
    public ClassPathXmlApplicationContext(String configLocation) {
        this(new String[]{configLocation});
    }

}
