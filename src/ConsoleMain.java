public class ConsoleMain {
    public static void main(String[] args) {

        // 2 - različiti konstruktori, defaultni

        Students ivan = new Students("Ivan", "Sacer",5);
        Students mona = new Students();

        // 1 - upis imena koristeći varijablu i setter
        //     private varijabla u Students se ne može dohvatiti direktno nego preko settera

        ivan.first_name = "Mona";
        ivan.setFirst_name("Ivan");

        System.out.println(ivan.getFirst_name());
    }

}
