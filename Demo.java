public class Demo {
    public static void main(String[] args) {

        // Create the news agency
        NewsAgency agency = new NewsAgency();

        // Create subscribers
        Subscriber alice = new BasicSubscriber("Alice");
        Subscriber bob = new BasicSubscriber("Bob");
        Subscriber carla = new BasicSubscriber("Carla");

        // Subscribe users
        agency.subscribe(alice);
        agency.subscribe(bob);

        // Publish first news
        agency.publishNews("Earthquake hits Souther Luzon.");

        // New subscriber joins later
        agency.subscribe(carla);

        // Publish second news
        agency.publishNews("Government issues evacuation warnings.");

        // One subscriber leaves
        agency.unsubscribe(bob);

        // Publish third news
        agency.publishNews("Weather update: Conditions improving.");
    }
}
