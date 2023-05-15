package configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class AppProperties {
    static Logger logger = LoggerFactory.getLogger(AppProperties.class);
    YamlReader yamlReader = new YamlReader();
    private Config config;

    private AppProperties() {
        setConfigProperties();
    }

    public static AppProperties getInstance() {
        return AppProperties.AppPropertiesSingleton.INSTANCE;
    }

    private void setConfigProperties() {
        config = yamlReader.getConfig();
        Map<String, Object> configProperties = config.getData();
        for (Map.Entry entry : configProperties.entrySet()) {
            System.setProperty(entry.getKey().toString(), entry.getValue().toString());
            logger.info("Load config properties: {} = {}", entry.getKey().toString(), entry.getValue().toString());
        }
    }

    private static class AppPropertiesSingleton {
        private static final AppProperties INSTANCE = new AppProperties();
    }
}