package CS151Hw03;

/**
 * Class that represent an objects
 */

public class Model {
     int redSize;
     int greenSize;
     int blueSize;

    /**
     * class for setSize
     * @param redSize red size
     * @param greenSize green size
     * @param blueSize blue size
     */
    public void setSize(int redSize, int greenSize, int blueSize) {
        if(redSize >= 0 ) {
            this.redSize = redSize;
        }
        if(greenSize >= 0) {
            this.greenSize = greenSize;
        }
        if(blueSize >= 0) {
            this.blueSize = blueSize;
        }
    }

    /**
     * class for reset size
     */
    public void resetSize() {
        this.redSize = 0;
        this.greenSize = 0;
        this.blueSize = 0;
    }
    /**
     * class for return red size
     */
    public int getRedSize() {
        return redSize;
    }
    /**
     * class for return green size
     */
    public int getGreenSize() {
        return greenSize;
    }
    /**
     * class for return blue size
     */
    public int getBlueSize() {
        return blueSize;
    }
}
