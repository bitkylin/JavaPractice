package mydemo;

import java.util.ArrayList;
import java.util.List;

class Observable {
    private String string;
    private List<Observer> list = new ArrayList<>();

    String getString() {
        return string;
    }

    void attach(Observer observer) {
        list.add(observer);
    }

    public void detach(Observer observer) {
        list.remove(observer);
    }

    void notifyObserver(String string) {
        this.string = string;
        list.forEach((observer) -> observer.update(this));
    }
}
