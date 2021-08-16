package tinkoff.sirius.springcore.example.samples.v3;

import org.springframework.stereotype.Component;

@Component
public class TelegramMessenger implements Messenger {

    private String messengerName;

    private void callMeBackDurov() {
        System.out.println("Telegram - Pavel, what happened with VK? Call me back immediately");
    }

    @Override
    public void sendMessage(String message) {
        callMeBackDurov();
        // sends message to telegram account
        System.out.println(message);
    }

    public void setMessengerName(String messengerName) {
        this.messengerName = messengerName;
    }
}
