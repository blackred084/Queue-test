import java.util.*;

public class Runner {
    public static void main(String[] args) {
        HospitalQueueService hospitalQueueService = new HospitalQueueService();

        System.out.println("Witaj uzytkowniku");
        boolean shouldExit = false;
        Scanner scanner = new Scanner(System.in);
        while (!shouldExit) {
            printMenu();
            String line = scanner.nextLine();

            if (line.equals("1")) {
                System.out.println("Podaj imie");
                String name=scanner.nextLine();
                System.out.println("Podaj Nazwisko");
                String surname=scanner.nextLine();
                System.out.println("Podaj wkurzenie");
                String how_Angry=scanner.nextLine();
                System.out.println("Podaj chorobe");
                String illness=scanner.nextLine();
                Integer how_AngryInt=Integer.valueOf(how_Angry);

                Patient patient = new Patient(name,surname,how_AngryInt,Choroba.valueOf(illness.toUpperCase()));
                hospitalQueueService.addPatient(patient);

            }
            //pob dane uz
            else if (line.equals("2")) {
                System.out.println(hospitalQueueService.next());
            } else if (line.equals("3")) {
                System.out.println(hospitalQueueService.peek());
            } else if (line.equals("4")) {
                shouldExit=true;
            }

        }

    }

    private static void printMenu() {
        System.out.println("1. Nowy pacjent");
        System.out.println("2. Nastepny pacjent");
        System.out.println("3. Podejrzyj pacjenta");
        System.out.println("4. Zakoncz");

    }
}
