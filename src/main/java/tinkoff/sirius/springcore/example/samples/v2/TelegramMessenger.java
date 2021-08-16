package tinkoff.sirius.springcore.example.samples.v2;

public class TelegramMessenger implements Messenger {

    private void callMeBackDurov() {
        System.out.println("Pavel, what happen with VK");
    }

    @Override
    public void sendMessage(String message) {
        callMeBackDurov();
        // sends message to telegram account
        System.out.println(message);
    }
}
