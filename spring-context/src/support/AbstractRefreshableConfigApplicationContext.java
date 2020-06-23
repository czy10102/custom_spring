package support;

import beans.factory.DefaultListableBeanFactory;

public abstract class AbstractRefreshableConfigApplicationContext extends AbstractApplicationContext  {
    @Override
    public final void refreshBeanFactory() {

    }
    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);
}
