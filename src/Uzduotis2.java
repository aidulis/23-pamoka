public class Uzduotis2 {
    public static void main(String[] args) {

        int rezultatas1 = patikrintiArSkaiciusLyginis(6,3);
        System.out.println("rezultatas1 = " + rezultatas1);

        int rezultatas2 = patikrintiArSkaiciusLyginis(3,1);
        System.out.println("rezultatas2 = " + rezultatas2);

    }

    public static int patikrintiArSkaiciusLyginis(int x, int y){
        if (x % 2 == 0){
            return x * y;
        } else {
            return y - x;
        }
    }
}
