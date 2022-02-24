//TaskThree

public class Datamatik {

public static void main(String[] args) {
  Teacher Tobias = new Teacher("Tobias", 30, false);
  Student Natasja = new Student("Natasja", 22, true, "TeamFive");
  Student Abdullah = new Student("Abdullah", 21, false, "GruppeF");
  System.out.println(Tobias.name + Tobias.age + Tobias.isFemale);
  System.out.println("First Student name: " + Abdullah.name + " from Team " + Abdullah.datamatikerTeam);
  System.out.println("Second Student name: " + Natasja.name + " from Team " + Natasja.datamatikerTeam);
}
}
