
/**
 *
 * @author MrPotatoman
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (value < upperLimit) {
            value++;
        } else {
            value = 0;
        }
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        if (value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }

    public void setValue(int newValue) {
        if (newValue < 0 || newValue>upperLimit) {
            this.value = 0;
        } else {
            this.value = newValue;
        }
    }
}
