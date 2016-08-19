package nativeapply;

public class Client {
    public static void main(String[] args){
    MyObservable myObservable=new MyObservable();
        myObservable.addObserver(new MemberOne());
        myObservable.addObserver(new MemberTwo());
        myObservable.notify("老板来了");
    }

}
