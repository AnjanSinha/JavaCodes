import javax.print.event.PrintEvent;

class A
{
    void show(){
        System.out.println("Hello world");
    }
}

class B extends A
{
    void show(){
        int a = 30;
        super.show();
        System.out.println(a);
    }
}

class test {

    public static void main(String[] args) {
        B r = new B();
        r.show();
    }
    
}
