package azienda_sanitaria;

public class Doctor {

    private int id;
    private String name;
    private int numberOfPatients;

    public Doctor(){}

    public Doctor(int id, String name) {
        this.id = id;
        this.name = name;
        this.numberOfPatients =0;
    }

    public Doctor(int id, String name, int numberOfPatients) {
        this.id = id;
        this.name = name;
        this.numberOfPatients = numberOfPatients;
    }

    /**
     * @method incrementNumberofPatients
     * metodo che aggiorna il conteggio totale dei pazienti in cura da un medico
     */
    public void incrementNumberOfPatients(){
        numberOfPatients+=1;
    }

    /**-------------------------------toString
     *
     */
    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfPatients=" + numberOfPatients +
                '}';
    }

    /**-------------------------------Getters & Setters
     *
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    /**
     *
     * @param numberOfPatients
     */
    public void setNumberOfPatients(int numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }
    public int getNumberOfPatients() {
        return numberOfPatients;
    }


}
