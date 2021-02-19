package my.exercise.Week_04;

public class WaitTest {
    static Object obj = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("t1 get lock");
                    try {
                        obj.wait(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("t1 after wait");
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("t2 get lock");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("t2 end");
//                    obj.notify();
                }
            }
        });
        t1.start();
        t2.start();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("term");
    }
}
