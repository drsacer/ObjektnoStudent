public class ConsoleMain {
    public static void main(String[] args) {

        // 2 - različiti konstruktori, defaultni

        Students ivan = new Students("Ivan", "Sacer",4);
        Students mona = new Students();

        // 1 - upis imena koristeći varijablu i setter
        //     private varijabla u Students se ne može dohvatiti direktno nego preko settera

        ivan.first_name = "Mona";
        ivan.setFirst_name("Ivan");
        // ivan.year = 5;  ne može jer je year private

        System.out.println(ivan.getFirst_name());
        System.out.println();

        // 3 - pozivanje metoda - void i s povratnom vrijednošću (get) , te slanje argumeneta (set)

        // Mona nije instancirana preko konstruktora
        mona.setYear(1);
        mona.setFirst_name("Mona");
        mona.yearUp();
        mona.yearUp();
        mona.yearUp();
        mona.yearUp();

        ivan.yearUp();

        System.out.println("Mona - godina studija:" + mona.getYear());
        System.out.println("Ivan - godina studija:" + ivan.getYear());
        System.out.println();

        // 4- toString metoda

        System.out.println(mona);
        System.out.println(ivan);
    }

}
