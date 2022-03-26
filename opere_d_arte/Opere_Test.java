package opere_d_arte;

public class Opere_Test {

    public static void main(String[] args) {

        Square s1 = new Square(1, "Vincenzo", "Esposizione", 100, 100);
        Square s2 = new Square(2, "Vinc", "Esposizione", 1050, 1006);
        Square s3 = new Square(3, "enzo", "Magazzino", 456, 189);
        Square s4 = new Square(4, "Vin", "In viaggio", 350, 1200);
        Square s5 = new Square(5, "Vincent", "Esposizione", 1000, 10);

        Sculpture a1 = new Sculpture(6, "vincenzo", "Esposizione", 110,320,320);
        Sculpture a2 = new Sculpture(7, "vi", "Magazzino", 1056,80,3650);
        Sculpture a3 = new Sculpture(8, "cenzo", "In viaggio", 1560,2450,306);
        Sculpture a4 = new Sculpture(9, "vnzo", "Esposizione", 1110,2320,380);
        Sculpture a5 = new Sculpture(10, "enzo", "Magazzino", 19870,260,304);


        //prova metodo printEncumbrance
        System.out.println(s2.printEncumbrance());
        System.out.println(a3.printEncumbrance());


        ArtWork_Collection x = new ArtWork_Collection("Salerno", "Opere di prova");

        //prova metodo printCollection con arraList delle opere vuota
        x.printCollection();

        //prova metodo insert_ArtWork
        x.insert_Artwork(s1);
        x.insert_Artwork(s2);
        x.insert_Artwork(s3);
        x.insert_Artwork(s4);
        x.insert_Artwork(s5);
        x.insert_Artwork(a1);
        x.insert_Artwork(a2);
        x.insert_Artwork(a3);
        x.insert_Artwork(a4);
        x.insert_Artwork(a5);

        //prova metodo printCollection
        x.printCollection();

        //prova metodo printArtWorkOccupation
        x.printArtWorkOccupation(6);
        x.printArtWorkOccupation(11);





    }
}
