package nagikh.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GreetingPrinterField {
    @Autowired
    @Qualifier("formalGreetingService")
    private GreetingService greetingService;

    public void print(String name){
        System.out.println(greetingService.print(name));
    }
}
