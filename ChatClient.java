import java.lang.Runtime.Version;
import java.util.Scanner;

public class ChatClient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Jinsu");
        User user2 = new UserImpl(mediator, "soyeon");
        User user3 = new UserImpl(mediator, "abyeol");
        User user4 = new UserImpl(mediator, "binho");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("hi all");
        while (true) {
            System.out.println();

            System.out.println("[select people who will chat]");
            System.out.println("1 :Jinsu");
            System.out.println("2 :soyeon");
            System.out.println("3 :abyeol");
            System.out.println("4 :binho");

            System.out.println();

            Integer nextInt = Integer.parseInt(sc.nextLine());
            System.out.println("[input msg]");
            System.out.println();
            String nextLine = sc.nextLine();

            switch (nextInt) {
                case 1:
                    user1.send(nextLine);
                    break;
                case 2:
                    user2.send(nextLine);
                    break;
                case 3:
                    user3.send(nextLine);
                    break;
                case 4:
                    user4.send(nextLine);
                    break;
                default:
                    break;
            }
        }
    }
}
