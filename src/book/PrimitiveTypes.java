package book;

public class PrimitiveTypes {
    public static void main(String[] args) {
        short s = 10;
        short t = 0;

        while (s!=0){

            t+=(s&1);
            s>>>=1;
            System.out.println(t);

        }


    }
}
