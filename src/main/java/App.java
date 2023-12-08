import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld hw = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat microCat = applicationContext.getBean("catBean", Cat.class);
        Cat megaCat = applicationContext.getBean("catBean", Cat.class);
        System.out.println(bean == hw);
        System.out.println(megaCat == microCat);
    }
}