// Interface A is defined with an abstract method run()
interface A1 {
    public abstract void run();
}
// Class B is defined which implements A and an empty implementation of run()
class B1 implements A1 {
    public void run() {}
}
// Create a class named MyThread and extend/implement the required class/interface
class MyThread extends B1 {
    // Define a method in MyThread class to print the output
    public void run() {
        System.out.print("NPTEL Java");
    }
}
// Main class Question is defined
public class W6A3{
    public static void main(String[] args) {
        // An object of MyThread class is created
        MyThread t = new MyThread();
        // run() of class MyThread is called
        t.run();
    }
}