public class NewThreadRun implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" started");

        try {
            Thread.sleep(300);
        }
        catch (InterruptedException e)
        {System.out.println("Thread has bin interrupted");}

        System.out.println(Thread.currentThread().getName() +" finished");
    }
}
