public class BasicSubscriber implements Subscriber {

    private String name;

    public BasicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println("→ " + name + " received update: " + news);
    }

    @Override
    public String getName() {
        return name;
    }
}
