package CS151Hw03;

/**
 * class that updates the message
 */
public class UpdateMessage implements Message {
    int redSize;
    int greenSize;
    int blueSize;

    /**
     * constructor of UpdateMessage
     * @param redSize red size
     * @param greenSize green size
     * @param blueSize blue size
     */
    public UpdateMessage( int redSize, int greenSize, int blueSize) {
        this.redSize = redSize;
        this.greenSize = greenSize;
        this.blueSize = blueSize;
    }
    public int getRedSize() {
        return redSize;
    }
    public int getGreenSize() {
        return greenSize;
    }
    public int getBlueSize() {
        return blueSize;
    }
}
