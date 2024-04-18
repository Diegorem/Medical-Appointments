import javax.print.Doc;

public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    String name;
    String email;
    String specility;

    Doctor(){
        //System.out.println("Construyendo el objeto Doctor");
        name = "Perengano";
        specility = "Trolo";

    }

    Doctor(String name, String specility){
        id++;
        this.name = name;
        this.specility = specility;

    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

}
