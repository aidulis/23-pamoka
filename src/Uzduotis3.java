public class Uzduotis3 {
    public static void main(String[] args) {

        boolean rezultatas1 = patikrintiArXYraYKartotinis(72,8);
        System.out.println("rezultatas1 = " + rezultatas1);

        boolean rezultatas2 = patikrintiArXYraYKartotinis(10,4);
        System.out.println("rezultatas2 = " + rezultatas2);
    }
    public static boolean patikrintiArXYraYKartotinis(int x, int y){
        if (x % y == 0){
            return true;
        }
        return false;
    }
}
