package sample.di.business.config;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

//@PropertySource("classpath:META-INF/message.properties")
@Configuration
@ComponentScan("sample.di")
public class AppConfig {

    @Bean(name="msgProperties")
    public PropertiesFactoryBean msgProperties() {
        PropertiesFactoryBean bean = new PropertiesFactoryBean();
        //bean.setLocation(new ClassPathResource("classpath:META-INF/message.properties"));
        bean.setLocation(new ClassPathResource("META-INF/message.properties"));
        return bean;
    }
    
}
