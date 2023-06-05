public class Uzduotis4 {
    public static void main(String[] args) {

        String str1 = "Aš gyvenu Kaune";
        String str2 = "Vilnius yra Lietuvos sostinė";
        String rezultatas1 = patikrintiArVienodiTekstai(str1, str2);
        System.out.println("rezultatas1 = " + rezultatas1);

    }

    public static String patikrintiArVienodiTekstai(String str1, String str2){
        if(str1 == str2){
            return "Tekstai yra vienodi";
        }
        else{
            return "Tekstai yra skirtingi";
        }
    }
}
