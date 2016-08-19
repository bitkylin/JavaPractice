package nativeapply;

import java.util.Observable;

class MyObservable extends Observable {

    String getString() {
        return "这是被观察者";
    }

    void notify(String string) {
        setChanged();
        notifyObservers(string);
    }
}
