package nagikh.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        GreetingPrinterConstructor printer =
                context.getBean(GreetingPrinterConstructor.class);

        printer.print("Pasha");

        GreetingPrinterSetter printer2 =
                context.getBean(GreetingPrinterSetter.class);

        printer2.print("Pasha");

        GreetingPrinterField printer3 =
                context.getBean(GreetingPrinterField.class);

        printer3.print("Pasha");


        context.close();

    }
}
