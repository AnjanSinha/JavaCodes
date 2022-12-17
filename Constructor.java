class A{
    int a,x; String name,y;
    A()
    {
        a = 45;
        name = "anjan";
        System.out.println(a+" "+name);
    }
    A(A ref)
    {
        x=ref.a;
        y=ref.name;
        System.out.println(x+" "+y);
    }
}
class Constructor {
    public static void main(String[] args) {
        A r = new A();
        A r2 = new A(r);
    }
}
