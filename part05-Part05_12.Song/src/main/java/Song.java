
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the type of the compared object is not SimpleDate, the objects are not
        // equal
        if (!(compared instanceof Song)) {
            return false;
        }

        // convert the Object type compared object
        // into a SimpleDate type object called comparedSimpleDate
        Song comparedSimpleDate = (Song) compared;

        // if the values of the object variables are the same, the objects are equal
        if (this.artist.equals(comparedSimpleDate.artist) &&
                this.name.equals(comparedSimpleDate.name) &&
                this.durationInSeconds == comparedSimpleDate.durationInSeconds) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
