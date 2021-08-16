package tinkoff.sirius.springcore.example.samples.v1;

public class WhatsAppMessenger {

    private void callMeBackMark() {
        System.out.println("Mark, how are u? Call me back");
    }

    public void sendMessage(String message) {
        callMeBackMark();
        // sends message to whats app account
        System.out.println(message);
    }
}
