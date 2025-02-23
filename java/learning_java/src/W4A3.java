interface ExtraLarge{
    String extra = "This is extra-large";
    void display();
}
class Large {
    public void Print() {
        System.out.println("This is large");
    }
}
class Medium extends Large {
    public void Print() {
        super.Print();
        System.out.println("This is medium");
    }
}
class Small extends Medium {
    public void Print() {
        super.Print();
        System.out.println("This is small");
    }
}
class W4A3 implements ExtraLarge{
    public static void main(String[] args) {
        Small s = new Small();
        s.Print();
        W4A3 q = new W4A3();
        q.display();
    }
    public void display(){
        System.out.print(extra);
    }
}
