package nagikh.dev;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GreetingPrinterConstructor {
    private final GreetingService greetingService;

    public GreetingPrinterConstructor(@Qualifier("friendlyGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void print(String name){
        System.out.println(greetingService.print(name));
    }
}
