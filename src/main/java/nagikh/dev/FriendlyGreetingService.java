package nagikh.dev;

import org.springframework.stereotype.Service;

@Service
public class FriendlyGreetingService implements GreetingService{
    @Override
    public String print(String name) {
        return "Дружелюбное приветствие " + name;
    }
}
