public class Main {
    public static void main(String[] args) {
        MyService myService = new MyService();
        System.out.println(myService.getMyEntity());
        System.out.println(myService.setMyEntity(newMyEntity("second")));
        System.out.println(myService.getMyEntity());
    }
}