package beans.factory.xml;

public interface BeanDefinitionReader {

    int loadBeanDefinitions(String... locations);
    int loadBeanDefinitions(String location);
}
