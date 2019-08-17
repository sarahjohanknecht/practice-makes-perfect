import java.util.concurrent.Semaphore;

class Foo {
    Semaphore second;
    Semaphore third;

    public Foo() {
        second = new Semaphore(0);
        third = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {

        //print first - no semaphore needed
        printFirst.run();

        //first has been printed, so the sempahore for second can be released
        second.release();

    }

    public void second(Runnable printSecond) throws InterruptedException {
        //acquire the second semaphore to print
        second.acquire();
        printSecond.run();

        //second has been printed, so the semaphore for third can be released
        third.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        //acquire the third semaphore to print
        third.acquire();
        printThird.run();
    }
}
