class W6A5 extends Thread{
    public void run(){
        System.out.println("Thread is running.");
    }
    public static void main(String args[]){
        W6A5 t=new W6A5();
        System.out.println("Name of thread 't':"+ t.getName());
// start the thread  
        t.start();
// set the name
        t.setName("NPTEL");
        System.out.println("New name of thread 't':"+ t.getName());
    }
}