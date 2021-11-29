
public class Main {

    public static void main(String[] args) {
        Message message1 = new Message("Henk", "Hello man");
        Message message2 = new Message("Sven", "Hello woman");

        MessagingService ms1 = new MessagingService();

        ms1.add(message1);
        ms1.add(message2);

        System.out.println(ms1);

        ms1.getMessages();

        // Try out your class here
    }
}
