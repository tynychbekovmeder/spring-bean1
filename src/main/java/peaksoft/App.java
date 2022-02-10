package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld helloWorld = applicationContext.getBean("helloworld",HelloWorld.class);
        System.out.println(helloWorld.getMessage());

        System.out.println(bean==helloWorld);

        Cat cat = applicationContext.getBean("cat",Cat.class);
        System.out.println(cat);

        Cat cat1 = applicationContext.getBean("cat",Cat.class);
        System.out.println(cat1);

        System.out.println(cat==cat1);
    }
}
