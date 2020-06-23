package support;

import beans.factory.DefaultListableBeanFactory;
import beans.factory.xml.XmlBeanDefinitionReader;

public abstract class AbstractXmlApplicationContext  extends AbstractRefreshableConfigApplicationContext{
    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {

    }

    protected void loadBeanDefinitions(XmlBeanDefinitionReader reader){

    }
}
