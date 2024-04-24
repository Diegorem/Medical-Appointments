package model;

public class Patient extends User {
    // Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email){
        super(name, email);
        //más instrucciones
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return this.weight + " KG.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + " Weight: " + getWeight() + "\nHeight: " + getHeight() + " Blood: " + blood;
    }

    // Implementación de método abstracto obligatorio por la clase que hereda
    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimeinto");
    }
}
