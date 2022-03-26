package opere_d_arte;

import java.util.Objects;

public class Square extends ArtWork {
    public double height;
    public double width;

    public Square(){}

    public Square(int id, String artist, String occupation, double height, double width) {
        super(id, artist, occupation);
        this.height = height;
        this.width = width;
    }


    @Override
    public double printEncumbrance() {
        return height*width;
    }


    /**------------------------------Equals
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(square.height, height) == 0 && Double.compare(square.width, width) == 0;
    }

    /**------------------------------toString
     *
     */
    @Override
    public String toString() {
        return "Square{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", occupation='" + occupation + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    /**------------------------------Getters & Setters
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }public double getHeight() {
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


}
