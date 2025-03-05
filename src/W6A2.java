class ThreadRun implements Runnable {
    public void run(){
        System.out.print("Thread using Runnable interface.");
    }
}
// Create main class W06_P2 with main() method and appropriate statements in it
public class W6A2{
    public static void main(String[] args) {
        ThreadRun ex = new ThreadRun();
        Thread t1= new Thread(ex);
        t1.start();
    }
}