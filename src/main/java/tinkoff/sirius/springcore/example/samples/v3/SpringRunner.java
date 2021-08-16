package tinkoff.sirius.springcore.example.samples.v3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MySpringConfig.class);
        MessageNotification messageNotification = annotationConfigApplicationContext.getBean(MessageNotification.class);
        messageNotification.notifyUser();
    }
}
