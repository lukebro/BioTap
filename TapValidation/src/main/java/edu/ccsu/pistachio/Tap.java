package main.java.edu.ccsu.pistachio;

import main.java.edu.ccsu.pistachio.interfaces.TapInterface;

public class Tap implements TapInterface {

    /**
     * Time stamp of tap.
     */
    private long time;

    /**
     * Duration of tap.
     */
    private long duration;

    /**
     * X coordinate of tap.
     */
    private int x;

    /**
     * Y coordinate of tap.
     */
    private int y;

    /**
     * Create a new instance of a tap with an interval.
     *
     * @param time
     * @param duration;
     */
    public Tap(long time, long duration, int x, int y) {
        this.set(time, duration, x, y);
    }

    /**
     * Create a new instance of a tap without an interval.
     *
     * @param time
     * @param x
     * @param y
     */
    public Tap(long time, int x, int y) {
        this.set(time, 0, x, y);
    }

    /**
     * Set properties on instance.
     *
     * @param time
     * @param duration
     * @param x
     * @param y
     */
    protected void set(long time, long duration, int x, int y) {
        this.time = time;
        this.duration = duration;
        this.x = x;
        this.y = y;
    }

    /**
     * Get string value of tap.
     *
     * @return
     */
    public String toString() {
        return this.getTime() + "/" + this.getDuration() + "/" + this.getX() + "/" + this.getY();
    }

    /**
     * Get the time interval between down and up.
     *
     * @return
     */
    public long getTime() { return this.time; }

    /**
     * Get the action of the tap.
     *
     * @return
     */
    public long getDuration() { return this.duration; }

    /**
     * Set the interval of the tap.
     *
     * @param duration
     * @return
     */
    public long setDuration(long duration) { return this.duration = duration; }

    /**
     * Get the x coordinate of tap.
     *
     * @return
     */
    public int getX() { return this.x; }

    /**
     * Get the y coordinate of tap.
     *
     * @return
     */
    public int getY() { return this.y; }

    /**
     * Get the time stamp of down touch.
     *
     * @return
     */
    public long getDownTime() { return this.time; }

    /**
     * Get the time stamp of up touch.
     *
     * @return
     */
    public long getUpTime() { return this.time + this.duration; }

}