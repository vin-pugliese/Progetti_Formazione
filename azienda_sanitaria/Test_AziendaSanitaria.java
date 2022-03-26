package azienda_sanitaria;

import java.util.List;

public class Test_AziendaSanitaria {
    public static void main(String[] args) throws EmptyListException {

        Doctor d1 = new Doctor(1, "vincenzo");
        Doctor d2 = new Doctor(2, "Giovanni");
        Doctor d3 = new Doctor(3, "Marco");
        Doctor d4 = new Doctor(4, "Antonio");
        Doctor d5 = new Doctor(5, "Giacomo");

        Patient p1 = new Patient(123, 3);
        Patient p2 = new Patient(456, 3);
        Patient p3 = new Patient(789, 3);
        Patient p4 = new Patient(101, 2);
        Patient p5 = new Patient(123, 4);
        Patient p6 = new Patient(123, 3);
        Patient p7 = new Patient(000, 6);
        Patient p8 = new Patient(123, 2);

        AziendaSanitaria a = new AziendaSanitaria();

        a.addDoctor(d1);
        a.addDoctor(d2);
        a.addDoctor(d3);
        a.addDoctor(d4);
        a.addDoctor(d5);

        //test metodo aggiungiPaziente
        a.addPatient(p1);
        a.addPatient(p2);
        a.addPatient(p3);
        a.addPatient(p4);
        a.addPatient(p5);
        a.addPatient(p6);
        a.addPatient(p7); //dottore non presente, paziente "000" non deve essere presente nella lista pazienti
        a.addPatient(p8);

        //test metodo statMedico
        Doctor t = a.statMedico();
        System.out.println(t.toString());

        //print delle liste pazienti e medici
        System.out.println("\nLista dottori\n");
        a.printDoctors();

        System.out.println("\nLista pazienti\n");
        a.printPatients();

        //test metodo listaMedico
        System.out.println("\nLista pazienti del dottor d2\n");
        List<Patient> l = a.listaMedico(d2);

        for(Patient p:l)                        //stampa il risultato del metodo ListaMedico
            System.out.println(p.toString());




    }
}
