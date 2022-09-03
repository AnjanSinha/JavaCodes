public class switchValue {

    public static void main(String[] args){

        String x = "Anjan";
        String y = "Sinha";

        System.out.println("Before switching values : "+x+y);

        String temp = x;
        x = y;
        y = temp;

        System.out.println("After switching values : "+x+y);

    }
}