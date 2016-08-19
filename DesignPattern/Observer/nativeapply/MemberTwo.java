package nativeapply;

import java.util.Observable;
import java.util.Observer;

public class MemberTwo implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("我是2，发生这件事："+ arg +",来自："+((MyObservable)o).getString());
    }
}
