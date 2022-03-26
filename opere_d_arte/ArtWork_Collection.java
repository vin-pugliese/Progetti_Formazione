package opere_d_arte;

import java.util.ArrayList;
import java.util.List;

public class ArtWork_Collection {

    private String place;
    private String name;
    List<ArtWork> collection = new ArrayList<ArtWork>();

    public ArtWork_Collection(){}

    public ArtWork_Collection(String place, String name){
        this.place = place;
        this.name = name;
    }

    public ArtWork_Collection(String place, String name, List<ArtWork> collection) {
        this.place = place;
        this.name = name;
        this.collection = collection;
    }

    /**
     * @method insert_ArtWork
     * Permette di inserire una nuova opera all'interno del field collection
     *
     */
    public void insert_Artwork(ArtWork x){
        collection.add(x);
    }

    /**
     * @method printCollection
     * Permette di stampare l'intera collezione
     */
    public void printCollection(){
        System.out.println(this.toString());
        for(ArtWork a:collection)
            System.out.println(a.toString());
    }

    /**
     * @method printArtWorkOccupation
     * Dato un intero in input, permette di trovare e stampare l'occupazione di una data opera
     */
    public void printArtWorkOccupation(int id){
        boolean found = false;
        for(ArtWork a : collection)
            if (a.getId() == id) {
                System.out.println(a.getOccupation());
                found = true;
            }
        if(!found) System.out.println("Opera non presente nella collezione");
    }

    /**------------------------------toString
     *
     */
    @Override
    public String toString() {
        return "ArtWork_Collection{" +
                "place='" + place + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    /**------------------------------Getters & Setters
     *
     * @param place
     *
     */
    public void setPlace(String place) {
        this.place = place;
    }
    public String getPlace() {
        return place;
    }

    /**
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
     * @param collection
     */
    public void setCollection(List<ArtWork> collection) {
        this.collection = collection;
    }
    public List<ArtWork> getCollection() {
        return collection;
    }



}
