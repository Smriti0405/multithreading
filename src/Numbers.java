public class Numbers {

    public static void main(String[] args) {
        Runnable obj1 = new Even();
        Runnable obj2 = new Odd();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
    class Even implements Runnable{
        public void run(){
            for(int i=2; i<=20; i++){
                if (i%2 == 0)
                    System.out.println(i);
            }
        }
    }
    class Odd implements Runnable{
        public void run(){
            for(int i=2; i<=20; i++){
                if (i%2 != 0)
                    System.out.println(i);
            }
        }
    }


