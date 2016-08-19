package mydemo;

public class CustomClient {
    public static void main(String[] args) {
        Observable observable = new Observable();
        observable.attach(new MemberOne());
        observable.attach(new MemberTwo());
        observable.notifyObserver("老板来了");
    }
}
