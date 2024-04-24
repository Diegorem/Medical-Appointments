import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;


public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Manuel Medrano", "manomedrano@mail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        User user = new Patient("Rebeca", "rebe@mail.com");
        user.showDataUser();

        /*
        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */

        /*
        Patient patient = new Patient("Manolo", "maonolo@mail.com");
        patient.setAddress("Avenida Florinderia");
        patient.setPhoneNumber("5542689744");
        System.out.println(patient);

        System.out.println(myDoctor);
        */
    }


}
