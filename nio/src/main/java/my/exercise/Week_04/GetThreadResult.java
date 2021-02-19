package my.exercise.Week_04;

import java.util.concurrent.*;

public class GetThreadResult {
    public static void main(String[] args) throws Exception {
        ExecutorService pool1 = Executors.newFixedThreadPool(4);
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = sum();
                System.out.println(Thread.currentThread().getName() + "____" + sum);
                return sum;
            }
        };
        // 方法1
        Future<Integer> future = pool1.submit(callable);
        Integer res1 = callable.call();
        // 方法2
        FutureTask futureTask = new FutureTask(callable);
        pool1.submit(futureTask);
        System.out.println("rest2:" + futureTask.get());

    }

    private static int sum() {
        return fibo(5);
    }

    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
}
