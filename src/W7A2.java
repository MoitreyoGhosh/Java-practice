class Counter {
    private int count;

    public Counter(){
        this.count = 0;
    }

    public void increment(){
        count++;
    }
    public void decrement(){
        if(count>0){
            count--;
        }
    }
    public int getValue(){
        return count;
    }
}
public class W7A2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.decrement();
        System.out.println(counter.getValue()); // Output: 1
    }
}