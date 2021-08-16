package tinkoff.sirius.springcore.example.samples.v1;

public class MessageNotification {

    private TelegramMessenger telegramMessenger;

    public void notifyUser(String message) {
        telegramMessenger = new TelegramMessenger();
        telegramMessenger.sendMessage(message);
        // any code to send message
    }
}
