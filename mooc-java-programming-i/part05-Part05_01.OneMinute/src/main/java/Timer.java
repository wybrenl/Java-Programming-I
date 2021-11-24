public class Timer {
    private ClockHand seconds;
    private ClockHand hundrethsOfASecond;

    public Timer () {
        this.seconds = new ClockHand(60);
        this.hundrethsOfASecond = new ClockHand(100);
    }

    public void advance() {
        this.hundrethsOfASecond.advance();

        if(this.hundrethsOfASecond.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + hundrethsOfASecond;
    }
}
