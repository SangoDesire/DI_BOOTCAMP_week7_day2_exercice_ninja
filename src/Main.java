import exercice1.Student;
import exercice2.Player;

public class Main {
    public static void main(String[] args) {
        //Test Exercice 1
        Student student = new Student();
        student.setStdName("Kiran");
        student.setStdIdstdId(4);
        student.setStdIdstdId(12345);

        System.out.println("Student's Name: " + student.getStdName());
        System.out.println("Student's Roll no.: " + student.getStdRollNostdRollNo());
        System.out.println("Student's id: " + student.getStdIdstdId());

        //Test Exercice 2
        Player player = new Player("Desiré Kouadjo", 45, "Profesionnel Poker");
        System.out.println("Player's Name: " + player.getName());
        System.out.println("Player's Age: " + player.getAge());
        System.out.println("Player's Gametype: " + player.getGameType());
    }
}