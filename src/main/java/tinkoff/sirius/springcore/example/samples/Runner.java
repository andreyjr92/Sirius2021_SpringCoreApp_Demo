package tinkoff.sirius.springcore.example.samples;

import tinkoff.sirius.springcore.example.samples.v1.MessageNotification;

public class Runner {
    public static void main(String[] args) {
        MessageNotification messageNotification = new MessageNotification();
        messageNotification.notifyUser("My message");
    }
}
