import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Manuel Medrano", "Pediatria");
        System.out.println("Nombre: "+ myDoctor.name);
        System.out.println("Especialidad: " + myDoctor.specility);

        Patient patient = new Patient("John", "john@gmail.com");
        patient.setWeight(55.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());




    }


}
