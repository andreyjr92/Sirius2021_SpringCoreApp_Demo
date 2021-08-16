package tinkoff.sirius.springcore.example.samples.v3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageNotification {

    private final Messenger firstMessenger;
    private Messenger secondMessenger;

    @Autowired
    @Qualifier("ICQ")
    private Messenger thirdMessenger;

    // Dependency goes from the outside, IoC
    // Constructor-based dependency injection
    @Autowired
    public MessageNotification (TelegramMessenger firstMessenger) {
        this.firstMessenger = firstMessenger;
    }

    public void notifyUser() {
        firstMessenger.sendMessage("Message to your friend");
        secondMessenger.sendMessage("Message to your dad");
        thirdMessenger.sendMessage("Message to your grandma");
        // any code to send message
    }

    // Setter-based injection
    @Autowired
    public void setSecondMessenger(WhatsAppMessenger secondMessenger) {
        this.secondMessenger = secondMessenger;
    }
}
