package deposito_contenitori;

import java.util.ArrayList;

/*
Si vogliono mantenere le informazioni su un deposito di contenitori di liquidi.
Ogni contenitore (C) è dotato di un codice univoco; i contenitori possono essere di due tipi: lattine (L) e bidoni (B) entrambe queste categorie sono dotate di un campo nome per identificare il liquido contenuto e di un campo qta per dichiarare la quantità contenuta.
E' richiesta la presenza di una interfaccia CMP che contenga un metodo confronta() in grado di effettuare un confronto di peso fra due contenitori omolo
(L o B) considerando che i bidoni hanno sempre una quantità di liquido stoccato maggiore delle lattine.
Realizzare poi una classe U (utils) contenente un metodo C[] filtra(C[] T, C c) che riceve in ingresso un vettore T di contenitori ed un contenitore campione.
Il metodo filtra deve restituire il vettore T ripulito di tutti i contenitori che contengono lo stesso liquido del contenitore
campione (C c) passato come parametro .
Deve essere inoltre creato un attributo enumerazione per stabilire il livello di tossicità di L e B ed u interfaccia con un metodo che permetta di verificare chi dei due ha un liquido più tossico.
L interfaccia potrebbe estenderne un altra
 */
public class Test {

    public static void main(String[] args) {
        L l1 = new L("1", Toxic_index.LOW, "benzina", 100);
        L l2 = new L("2", Toxic_index.HIGH,"benzina", 110);
        L l3 = new L ("3", Toxic_index.HIGH,"olio", 50);
        L l4 = new L ("4", Toxic_index.HIGH,"olio", 60);
        L l5 = new L ("5", Toxic_index.MEDIUM,"olio", 70);
        L l6 = new L ("15", Toxic_index.HIGH,"olio", 80);
        L l7 = new L ("25", Toxic_index.MEDIUM,"olio", 90);
        L l8 = new L ("35", Toxic_index.MEDIUM,"olio", 100);


        B b = new B("6", Toxic_index.MEDIUM,"benina", 100);
        B b2 = new B("7",Toxic_index.MEDIUM, "benina", 90);
        B b3 = new B("8", Toxic_index.HIGH,"benina", 10);
        B b4 = new B("9", Toxic_index.LOW,"gasolio", 60);

        //---------------------------------------------------test metodo confronta
        System.out.println("Confronte tra lattine:");
        System.out.println(l3.confronta(l2));
        System.out.println(l2.confronta(l3));
        System.out.println(l2.confronta(b));

        System.out.println("Confronte tra barili:");
        System.out.println(b.confronta(b2));
        System.out.println(b3.confronta(b2));

        //---------------------------------------------------test metodo filtra su Lattine
        U u = new U();

        System.out.println("Metodo filtra su lattine\n");
        //costruisco arrayList per L.filtra
        ArrayList<C> arrayL = new ArrayList<>();
        arrayL.add(l1);
        arrayL.add(l2);
        arrayL.add(l3);
        arrayL.add(l4);
        arrayL.add(l5);
        arrayL.add(l6);
        arrayL.add(l7);
        arrayL.add(l8);

        //print dell'arrayList prima del metodo filtra
        for(int i=0; i< arrayL.size(); i++){
            System.out.println(arrayL.get(i).toString());
        }

        arrayL = u.filtra(arrayL, l3);

        //print dell'arrayList dopo il metodo filtra
        System.out.println("Dopo filtra");
        for(int j=0; j< arrayL.size(); j++){
            System.out.println(arrayL.get(j).toString());
        }

        System.out.println("\n");

        //---------------------------------------------------test metodo filtra su Barili
        System.out.println("Metodo filtra su barili\n");
        ArrayList<C> arrayB = new ArrayList<>();

        arrayB.add(b);
        arrayB.add(b2);
        arrayB.add(b3);
        arrayB.add(b4);

        //print dell'arrayList prima del metodo filtra
        for(int i=0; i< arrayB.size(); i++){
            System.out.println(arrayB.get(i).toString());
        }

        arrayB = u.filtra(arrayB, b);

        //print dell'arrayList dopo il metodo filtra
        System.out.println("Dopo filtra");
        for(int j=0; j< arrayB.size(); j++){
            System.out.println(arrayB.get(j).toString());
        }

        /*
        ---------------------------------------------------test metodo tossicità
        ---recap indici di tossicità
            l1 = low
            l5 medium
            l6 high
            l7 medium
            l8 medium
            b2 medium
            b3 high
            b4 low
        */
        l1.toxic(l5);
        l1.toxic(b2);
        b2.toxic(l6);
        l7.toxic(l8);
        l7.toxic(l1);
        b3.toxic(b4);
        b4.toxic(b3);













    }
}
