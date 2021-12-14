public class Names {
    public static void main(String[] args) {

        Thread t1 = new Thread("Scooby") {
            public void run() {
                System.out.println("My name is: " + Thread.currentThread().getName());
            }
        };
        Thread t2 = new Thread("Shaggy") {
            public void run() {
                System.out.println("My name is: " + Thread.currentThread().getName());
            }
        };
        t1.start();
        t2.start();
    }

}
