class Test
{
    int a=50; 
    String b ="anjan";
    void show(){
        System.out.print(a+" "+b);
    }
}
class Demo
{
    public static void main(String[] args) {
        Test check = new Test();
        check.show();
    }
}