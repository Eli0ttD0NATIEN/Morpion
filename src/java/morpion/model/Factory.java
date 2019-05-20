package java.morpion.model;

public class Factory {
    private Cross cross = new Cross();
    private Round round = new Round();

    public Cross getCross() {
        return this.cross;
    }

    public Round getRound() {
        return this.round;
    }

    public void setCross(Cross cross) {
        this.cross = cross;
    }

    public void setRound(Round round) {
        this.round = round;
    }

}
