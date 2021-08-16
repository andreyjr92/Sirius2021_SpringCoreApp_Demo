package tinkoff.sirius.springcore.example.samples.v2;

public class MessageNotification {

    private Messenger messenger;

    public MessageNotification(Messenger messenger) {
        this.messenger = messenger;
    }

    public void notifyUser(String message) {
        messenger.sendMessage(message);
        // any code to send message
    }
}
