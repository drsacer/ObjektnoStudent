public class ConsoleMain {
    public static void main(String[] args) {

        // upis imena koristeći varijablu i setter
        // private varijabla u Students se ne može dohvatiti direktno nego preko settera

        Students ivan = new Students();
        ivan.first_name = "Mona";
        ivan.setFirst_name("Ivan");

        System.out.println(ivan.getFirst_name());
    }

}
