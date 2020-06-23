package beans.factory.support;

import beans.factory.xml.BeanDefinitionReader;

public class AbstractBeanDefinitionReader implements BeanDefinitionReader {
    @Override
    public int loadBeanDefinitions(String... locations) {
        return 0;
    }

    @Override
    public int loadBeanDefinitions(String location) {
        return 0;
    }
}
