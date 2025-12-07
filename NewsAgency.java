import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private final List<Subscriber> subscribers = new ArrayList<>();

    // Add a subscriber
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("[SYSTEM] " + subscriber.getName() + " subscribed.");
    }

    // Remove a subscriber
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("[SYSTEM] " + subscriber.getName() + " unsubscribed.");
    }

    // Publish breaking news
    public void publishNews(String news) {
        System.out.println("\n[NEWS AGENCY] Breaking News: " + news);
        notifySubscribers(news);
    }

    // Notify all subscribers
    private void notifySubscribers(String news) {
        for (Subscriber sub : subscribers) {
            sub.update(news);
        }
    }
}
