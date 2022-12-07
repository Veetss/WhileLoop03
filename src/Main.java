public class Main {
    public static void main(String[] args) {

        int i = 1;
        int a = 0;
        int b = 1;
        int c;

        while(i <= 10){

            System.out.print(a + ". ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
}