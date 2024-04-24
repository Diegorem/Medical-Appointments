import model.*;

import java.util.Date;


public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Manuel Medrano", "manomedrano@mail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        User user = new Doctor("Rebeca", "rebe@mail.com");
        user.showDataUser();
        User user2 = new Patient("Rebeca", "rebe@mail.com");
        user2.showDataUser();
        // Clase anónima
        User user3 = new User("Romeo", "rome@mail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatría");;
            }
        };
        user3.showDataUser();

        // interfaz anónima
        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

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
