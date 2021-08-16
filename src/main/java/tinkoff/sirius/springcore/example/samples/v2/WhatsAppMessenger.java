package tinkoff.sirius.springcore.example.samples.v2;

public class WhatsAppMessenger implements Messenger {

    private void callMeBackMark() {
        System.out.println("Mark, how are u? Call me back");
    }

    @Override
    public void sendMessage(String message) {
        callMeBackMark();
        // sends message to whatsapp account
        System.out.println(message);
    }
}
