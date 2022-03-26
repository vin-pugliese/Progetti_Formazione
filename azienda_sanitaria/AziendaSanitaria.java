package azienda_sanitaria;

import java.util.ArrayList;
import java.util.List;

public class AziendaSanitaria {

    private List<Doctor> doctors = new ArrayList<Doctor>();
    private List<Patient> patients = new ArrayList<Patient>();

    public AziendaSanitaria(){}

    public AziendaSanitaria(List<Doctor> doctors, List<Patient> patients) {
        this.doctors = doctors;
        this.patients = patients;
    }

    /**
     * @method addPatient
     * Permette di aggiungere un nuovo paziente al field patients, dopo aver controllato tramite @method findDoctor
     * se il medico curante indicato è presente nella lista dei medici
     */
    public void addPatient(Patient x){
        try{
            findDoctor(x.getDoc_id());
        }
        catch(EmptyListException e) {
            System.out.println("Impossibile aggiungere paziente, dottore non presente");
            return;
        }

        patients.add(x);
    }

    /**
     * @method addDoctor
     * aggiunge un Dottore al field doctors
     */
    public void addDoctor(Doctor x){
        doctors.add(x);
    }

    /**
     * @method findDoctor
     * permette di ricercare se un medico è presente nel field doctors, nel caso in cui lo trova aggiorna il suo conteggio pazienti
     * @throws EmptyListException nel caso in cui non lo trova
     */
    private void findDoctor(int id) throws EmptyListException {
        boolean found=false;
        for(Doctor d:doctors)
            if (d.getId() == id) {
                d.incrementNumberOfPatients();
                found = true;
            }

        if(!found) {
            EmptyListException e = new EmptyListException("Dottore non presente!");
            throw e;
        }
    }

    /**
     *
     * @method listaMedico
     * @return la lista dei pazienti del medico passato come parametro
     *
     */
    public List<Patient> listaMedico(Doctor x) {
        List<Patient> res = new ArrayList<Patient>();
        for (Patient p : patients)
            if (p.getDoc_id() == x.getId())
                res.add(p);

        if (res.isEmpty())
            System.out.println("il medico non ha pazienti");

        return res;
    }



    /**
     * @method statMedico
     * @return il medico con il maggior numero di pazienti
     * @throws EmptyListException se la lista dei dottori è vuota
     */
    public Doctor statMedico() throws EmptyListException {
        if(doctors.isEmpty()){
            EmptyListException e = new EmptyListException("Lista vuota!");
            throw e;
        }
        Doctor d = new Doctor();
        for(Doctor c:doctors)
            if (c.getNumberOfPatients()>d.getNumberOfPatients()) {
                d = c;
            }

        System.out.print("Il dottore con il maggior numero di pazienti è: ");
        return d;
    }


    /**-----------------------------------------------------Print liste
     *
     * @method printPatients
     * stampa la lista dei pazienti
     */
    public void printPatients(){
        for(Patient p:patients)
            System.out.println(p.toString());
    }

    /**
     * @method printDoctors
     * stampa la lista dei dottori
     */
    public void printDoctors(){
        for(Doctor d:doctors)
            System.out.println(d.toString());
    }

    /**-----------------------------------------------------Getters & Setters
     *
     * @param doctors
     */
    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }
    public List<Doctor> getDoctors() {
        return doctors;
    }


    /**
     *
     * @param patients
     */
    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
    public List<Patient> getPatients() {
        return patients;
    }

}
