package opere_d_arte;

import java.util.Objects;

public abstract class ArtWork {

    protected int id;
    protected String artist;
    protected String occupation;

    public ArtWork(){}

    public ArtWork(int id, String artist, String occupation) {
        this.id = id;
        this.artist = artist;
        this.occupation = occupation;
    }

    public abstract double printEncumbrance();

    /**----------------------------------------Equals
     *
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArtWork)) return false;
        ArtWork artWork = (ArtWork) o;
        return id == artWork.id && artist.equals(artWork.artist) && occupation.equals(artWork.occupation);
    }

    /**------------------------------toString
     *
     */
    @Override
    public String toString() {
        return "ArtWork{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    /**------------------------------Getters & Setters
     *
     *
     * @param artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
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
     * @param occupation
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public String getOccupation() {
        return occupation;
    }


}
