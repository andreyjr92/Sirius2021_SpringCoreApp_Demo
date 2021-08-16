package tinkoff.sirius.springcore.example.samples.v1;

public class TelegramMessenger {

    private void callMeBackDurov() {
        System.out.println("Pavel, what happen with VK");
    }

    public void sendMessage(String message) {
        callMeBackDurov();
        // sends message to telegram account
        System.out.println(message);
    }
}
