import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    int state;
    String userId;
    String name;
    List<Topic> subscribeList;

    User(String name) {
        userId = UUID.randomUUID().toString();
        this.name = name;
        subscribeList = new ArrayList<>();
    }

    void subscriberTo(Topic topic) {
        subscribeList.add(topic);
    }

    void publishTo(Topic topic, String message) {
        Message
    }
}
