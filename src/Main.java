import java.util.Date;

import static ui.UIMenu.showMenu;


public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Manuel Medrano", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println("Nombre: " + myDoctor.getName());
        System.out.println("Especialidad: " + myDoctor.getSpecility());

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        /*

        Patient patient = new Patient("John", "john@gmail.com");
        patient.setWeight(55.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

        */


    }


}
