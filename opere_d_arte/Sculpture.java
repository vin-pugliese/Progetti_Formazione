package opere_d_arte;

import java.util.Objects;

public class Sculpture extends ArtWork{

    private double height;
    private double width;
    private double depth;

    public Sculpture(){}

    public Sculpture(int id, String artist, String occupation, double height, double width, double depth) {
        super(id, artist, occupation);
        this.height = height;
        this.width = width;
        this.depth = depth;
    }



    @Override
    public double printEncumbrance() {
        return height*width*depth;
    }


    /**------------------------------Equals
     *
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sculpture)) return false;
        if (!super.equals(o)) return false;
        Sculpture sculpture = (Sculpture) o;
        return Double.compare(sculpture.height, height) == 0 && Double.compare(sculpture.width, width) == 0 && Double.compare(sculpture.depth, depth) == 0;
    }

    /**------------------------------toString
     *
     */
    @Override
    public String toString() {
        return "Sculpture{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", occupation='" + occupation + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }

    /**------------------------------Getters & Setters
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    /**
     *
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    /**
     *
     * @param depth
     */
    public void setDepth(double depth) {
        this.depth = depth;
    }
    public double getDepth() {
        return depth;
    }


}
