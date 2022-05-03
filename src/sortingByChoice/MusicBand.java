package sortingByChoice;

public class MusicBand {
    static int totalBands;
    String bandName;
    int auditionCount;

    // constructors
    MusicBand() {
        this.bandName = "No Name";
        this.auditionCount = -1;
        totalBands++;
    }
    MusicBand(String bandName) {
        this.bandName = bandName;
        this.auditionCount = 0;
        totalBands++;
    }
    MusicBand(String bandName, int auditionCount) {
        this.bandName = bandName;
        this.auditionCount = auditionCount;
        totalBands++;
    }
    // ======

    // OVERRIDES
    @Override
    public String toString() {
        return "'" + this.bandName + "': [" + auditionCount + "]";
    }
    // ======

    // SET-GET methods
    public void setBandName(String bandName) {

    }
    public String getBandName() {
        return this.bandName;
    }
    public void setAuditionCount(int audCount) {

    }
    public int getAuditionCount() {
        return this.auditionCount;
    }
    // ======

    // other methods
    public void showBandInfo() {
        System.out.println("Band name: " + bandName + ".\n" + "Audition count: " + auditionCount + " times.\n" + "Total Bands in collection: " + totalBands + ".");
    }
    // ======

}
