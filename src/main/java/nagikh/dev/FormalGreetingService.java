package nagikh.dev;

import org.springframework.stereotype.Service;

@Service
public class FormalGreetingService implements GreetingService {
    @Override
    public String print(String name) {
        return "Формальное приветствие " + name;
    }
}
