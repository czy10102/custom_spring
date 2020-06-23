package context;

public interface ConfigurableApplicationContext {
    void refresh();
    void refreshBeanFactory();
    void setConfigLocations(String... configLocations);
}
