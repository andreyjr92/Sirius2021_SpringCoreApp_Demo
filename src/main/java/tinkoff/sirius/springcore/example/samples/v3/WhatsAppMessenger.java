package tinkoff.sirius.springcore.example.samples.v3;

public class WhatsAppMessenger implements Messenger {

    private void callMeBackMark() {
        System.out.println("Whats App - Mark, how are u? Call me back");
    }

    @Override
    public void sendMessage(String message) {
        callMeBackMark();
        // sends message to whats app account
        System.out.println(message);
    }
}
