public interface ChatMediator {

    public void SendMessage(String msg, User user);

    void addUser(User user);
}
