package azienda_sanitaria;

public class Patient {

    private int healthCardNumber;
    private int doc_id;

    public Patient(){}

    public Patient(int healthCardNumber, int doc_id) {
        this.healthCardNumber = healthCardNumber;
        this.doc_id = doc_id;
    }

    /**-------------------------------toString
     *
     */
    @Override
    public String toString() {
        return "Patient{" +
                "healthCardNumber=" + healthCardNumber +
                ", doc_id='" + doc_id + '\'' +
                '}';
    }

    /**-------------------------------Getters & Setters
     *
     * @param healthCardNumber
     */
    public void setHealthCardNumber(int healthCardNumber) {
        this.healthCardNumber = healthCardNumber;
    }
    public int getHealthCardNumber() {
        return healthCardNumber;
    }

    /**
     *
     * @param doc_id
     */
    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }
    public int getDoc_id() {
        return doc_id;
    }

}
