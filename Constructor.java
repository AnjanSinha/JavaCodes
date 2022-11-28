class A{
    int a; String name;
    /*A()
    {
        a = 45;
        name = "anjan";
    }*/
    void show()
    { 
        System.out.println(a+" "+name);
    }
}
class Constructor {
    public static void main(String[] args) {
        A ref = new A();
        ref.show();
    }
}
