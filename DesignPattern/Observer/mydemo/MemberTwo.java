package mydemo;

class MemberTwo implements Observer {
    @Override
    public void update(Observable observable) {
        System.out.println("我是2，发生这件事：" + observable.getString());
    }
}
