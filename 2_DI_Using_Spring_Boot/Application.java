package org.kartikmankar.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        // By Using Manual Object Creation
//
//        Alien obj = new Alien();
//        obj.code();

        // Automatic object creation using spring boot
        ApplicationContext context = SpringApplication.run(Application.class, args);
        Alien obj1 = context.getBean(Alien.class);
        obj1.code(); // Now this show error because we don't tell which object you want
        // to create spring not create automatically object so for that we use @Component



    }

}
