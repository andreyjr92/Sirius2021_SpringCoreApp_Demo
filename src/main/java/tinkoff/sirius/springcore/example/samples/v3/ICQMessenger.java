package tinkoff.sirius.springcore.example.samples.v3;

import org.springframework.stereotype.Component;

@Component("ICQ")
public class ICQMessenger implements Messenger {

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
