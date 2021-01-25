package be.weve.jpatest;

import be.weve.jpatest.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        App app = applicationContext.getBean(App.class);
        app.run();
    }
}
