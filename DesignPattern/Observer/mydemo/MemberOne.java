package mydemo;

class MemberOne implements Observer {
    @Override
    public void update(Observable observable) {
        System.out.println("我是1，发生这件事："+observable.getString());
    }
}
